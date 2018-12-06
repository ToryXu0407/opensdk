package com.nascent.ecrp.opensdk.openplatformrequest.goods;


import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.goods.FindGoodsInfoResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询单个商品详情请求
 * Created by Lijian on 2018/11/28.
 */
@Setter
@Getter
public class FindGoodsInfoRequest extends OpenPlatformBaseRequest implements BaseRequest<FindGoodsInfoResponse> {

    /**
     * 外部平台商品ID
     */
    private String outItemId;

    /**
     * 商家编码
     */
    private String outerId;

    /**
     * 平台类型
     */
    private Integer platform;

    public String GetApiName() {
        return "/openApi/goodsQuery/findGoodsInfo";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<FindGoodsInfoResponse> getResponseClass() {
        return FindGoodsInfoResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("outItemId",this.getOutItemId());
        params.put("outerId",this.getOuterId());
        params.put("platform",this.getPlatform());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }



}
