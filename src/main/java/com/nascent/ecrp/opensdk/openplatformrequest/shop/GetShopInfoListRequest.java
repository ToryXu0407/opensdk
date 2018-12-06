package com.nascent.ecrp.opensdk.openplatformrequest.shop;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.shop.GetShopInfoListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询店铺列表请求
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class GetShopInfoListRequest extends OpenPlatformBaseRequest implements BaseRequest<GetShopInfoListResponse> {

    /**
     * 地址
     */
    private String address;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * (外部)店铺Id
     */
    private String outSid;

    /**
     * 页码
     */
    private Integer pageNo = 1;

    /**
     * 页面大小
     */
    private Integer pageSize = 10;

    /**
     * 省
     */
    private String province;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 店铺状态
     */
    private Integer shopStatus;

    /**
     * 店铺类型
     */
    private String shopType;

    public String GetApiName() {
        return "/openApi/shopQuery/getShopInfoList";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<GetShopInfoListResponse> getResponseClass() {
        return GetShopInfoListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("address",this.getAddress());
        params.put("city",this.getCity());
        params.put("district",this.getDistrict());
        params.put("outSid",this.getOutSid());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("province",this.getProvince());
        params.put("shopName",this.getShopName());
        params.put("shopStatus",this.getShopStatus());
        params.put("shopType",this.getShopType());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }

}
