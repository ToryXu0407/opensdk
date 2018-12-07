package com.nascent.ecrp.opensdk.openplatform;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatform.internal.sign.SignUtils;
import com.nascent.ecrp.opensdk.openplatform.internal.util.StringUtils;
import com.nascent.ecrp.opensdk.openplatform.internal.util.WebUtils;
import com.nascent.ecrp.opensdk.openplatformdomain.auth.GroupInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:16:21
 */
@Slf4j
public class DefaultOpenPlatformClient implements OpenPlatformClient {

    protected String serverUrl;
    protected String accessToken;
    protected String appKey;
    protected String appSecret;
    protected Long groupId;
    protected Long brandId;
    protected Long viewShopId;
    protected Boolean isRequestBody = false;

    protected int connectTimeout = 180000; // 默认连接超时时间为60秒
    protected int readTimeout = 180000; // 默认响应超时时间为60秒

    public  DefaultOpenPlatformClient(OpenPlatformBaseRequest request){
        this.accessToken = request.getAccessToken();
        this.serverUrl = request.getServerUrl();
        this.appKey = request.getAppKey();
        this.appSecret = request.getAppSecret();
        this.groupId = request.getGroupId();
        this.brandId = request.getBrandId();
        this.viewShopId = request.getViewShopId();
        if(request.getIsRequestBody()!=null){
            this.isRequestBody = request.getIsRequestBody();
        }
    }

    @Override
    public <T extends BaseResponse> T execute(BaseRequest<T> request) throws ApiException {
        return _execute(request);
    }
    private <T extends BaseResponse> T _execute(BaseRequest<T> request) throws ApiException {
        Map<String,Object> txtParams = new HashMap<>();
        //系统参数
        txtParams.put("nonce", System.currentTimeMillis());
        txtParams.put("appKey", this.appKey);
        txtParams.put("accessToken",this.accessToken);
        if(this.groupId!=null){
            txtParams.put("groupId",this.groupId);
        }
        if(this.brandId!=null){
            txtParams.put("brandId",this.brandId);
        }
        String sign;
        if (!isRequestBody) {
            //请求参数
            txtParams.putAll(request.GetParameters());
            //签名
            sign = SignUtils.signRequest(txtParams,this.appSecret);
        } else {
            sign = SignUtils.signRequest(txtParams,this.appSecret);
            txtParams.putAll(request.GetParameters());
        }

        txtParams.put("sign", sign);

        String body = "";
        String url = this.serverUrl + request.GetApiName();
        T rsp;
        JSONObject ob;
        try {
            if(isRequestBody){

                url+="?appKey="+txtParams.get("appKey")+"&accessToken="+txtParams.get("accessToken")
                        +"&nonce="+txtParams.get("nonce")+"&sign="+txtParams.get("sign");
                if(txtParams.get("groupId")!=null){
                    url+="&groupId="+txtParams.get("groupId");
                }
                if(txtParams.get("brandId")!=null){
                    url+="&brandId="+txtParams.get("brandId");
                }
                body = HttpClientUtil.postRequest(url,txtParams);
            }else{

                if (request.getMethodType() == "POST") {
                    body = WebUtils.doPost(url, txtParams, this.connectTimeout, this.readTimeout);
                } else {
                    body = WebUtils.doGet(url, txtParams);
                }
            }
           // String resultStr = ob.getString("result");
            // 判断获取的result是否为空
//            if(StringUtils.isEmpty(resultStr)){
//                // result为空则把body转成T
//                rsp = JSON.parseObject(body, request.getResponseClass());
//            }else{
//                // result不为空时获取其内部的result值，并转成T
//                rsp = JSON.parseObject(ob.getString("result"), request.getResponseClass());
//            }
            ob =JSON.parseObject(body);
            rsp = JSON.parseObject(ob.getString("result"), request.getResponseClass());
            rsp.setBody(body);
            rsp.setParams(txtParams);

            return rsp;
        }catch (Exception e) {
            String str = e.getMessage();
            if("syntax error, expect {, actual [, pos 0".equals(str)){
                rsp = JSON.parseObject(body, request.getResponseClass());
                rsp.setBody(body);
                rsp.setParams(txtParams);
                return rsp;
            }
            log.error("接收值转换时存在异常", e);
            throw new ApiException(e);
        }
    }

}
