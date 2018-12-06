package com.nascent.ecrp.opensdk.openplatformrequest.shop;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.shop.GetShopInfoResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询单个店铺详情请求
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class GetShopInfoRequest extends OpenPlatformBaseRequest implements BaseRequest<GetShopInfoResponse> {

    /**
     * 第三方网点编码
     */
    private String outSid;

    /**
     * 内部店铺Id
     */
    private Long shopId;

    public String GetApiName() {
        return "/openApi/shopQuery/getShopInfo";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<GetShopInfoResponse> getResponseClass() {
        return GetShopInfoResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("outSid",this.getOutSid());
        params.put("shopId",this.getShopId());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }

}
