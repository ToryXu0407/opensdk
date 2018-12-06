package com.nascent.ecrp.opensdk.openplatform;

import com.alibaba.fastjson.JSON;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatform.internal.sign.SignUtils;
import com.nascent.ecrp.opensdk.openplatform.internal.util.WebUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:16:21
 */
public class DefaultOpenPlatformClient implements OpenPlatformClient {

    protected String serverUrl;
    protected String accessToken;
    protected String appKey;
    protected String accountCode;
    protected Long groupId;
    protected Long brandId;
    protected Long viewShopId;
    protected Boolean isRequestBody = false;

    protected int connectTimeout = 180000; // 默认连接超时时间为60秒
    protected int readTimeout = 180000; // 默认响应超时时间为60秒

    public DefaultOpenPlatformClient(String serverUrl, String appKey, String accessToken, String accountCode, Long groupId, Long brandId,Long viewShopId){
        this.accessToken = accessToken;
        this.serverUrl = serverUrl;
        this.appKey = appKey;
        this.accountCode = accountCode;
        this.groupId = groupId;
        this.brandId = brandId;
        this.viewShopId = viewShopId;
    }
    public DefaultOpenPlatformClient(String serverUrl, String appKey, String accessToken, String accountCode, Boolean isRequestBody,Long groupId, Long brandId,Long viewShopId){
        this.accessToken = accessToken;
        this.serverUrl = serverUrl;
        this.appKey = appKey;
        this.accountCode = accountCode;
        this.groupId = groupId;
        this.brandId = brandId;
        this.viewShopId = viewShopId;
        this.isRequestBody = isRequestBody;
    }
    public <T extends BaseResponse> T execute(BaseRequest<T> request) throws ApiException {
        return _execute(request);
    }
    private <T extends BaseResponse> T _execute(BaseRequest<T> request) throws ApiException {
        Map<String,Object> txtParams = new HashMap<>();
        Map<String,String> map = new HashMap<>();
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
            sign = SignUtils.signRequest(txtParams,this.accountCode);
        } else {
            sign = SignUtils.signRequest(txtParams,this.accountCode);
            txtParams.putAll(request.GetParameters());
        }

        txtParams.put("sign", sign);

        String body = "";
        String url = this.serverUrl + request.GetApiName();
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

            T rsp = JSON.parseObject(body, request.getResponseClass());
            rsp.setBody(body);
            rsp.setParams(txtParams);

            return rsp;
        } catch (Exception e) {
            throw new ApiException(e);
        }
    }

}
