package com.nascent.ecrp.opensdk.openplatformrequest.shop;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatformresponse.shop.SaveShopInfoResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 单个店铺的创建请求
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class SaveShopInfoRequest implements BaseRequest<SaveShopInfoResponse> {

    //店铺状态
    private Integer shopStatus;
    //店铺类型
    private String shopType;
    //店铺名称
    private String shopName;
    //开店时间
    private String openShopTime;
    //营业时间段
    private String businessTimeSpan;
    //联系方式
    private String contactJson;
    //所属渠道
    private Long[] channels;
    //所属品牌
    private Long[] brands;
    //省
    private String province;
    //市
    private String city;
    //区
    private String district;
    //地址
    private String address;
    //经度
    private BigDecimal longitude;
    //纬度
    private BigDecimal latitude;
    //备注
    private String remark;
    //外部店铺编码
    private String outSid;
    // 店铺区域
    private String areaRegion;
    // 渠道类型
    private String channelCode;
    // 国家
    private String country;
    // 是否同步
    private Integer isSyn;
    // 平台类型
    private Integer platform;
    // 邮编
    private String zip;

    public String GetApiName() {
        return "/openApi/shopInsert/saveShopInfo";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<SaveShopInfoResponse> getResponseClass() {
        return SaveShopInfoResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("shopStatus", getShopStatus());
        params.put("shopType", getShopType());
        params.put("shopName", getShopName());
        params.put("openShopTime", getOpenShopTime());
        params.put("businessTimeSpan", getBusinessTimeSpan());
        params.put("contactJson", getContactJson());
        params.put("channels", getChannels());
        params.put("brands", getBrands());
        params.put("province", getProvince());
        params.put("city", getCity());
        params.put("district", getDistrict());
        params.put("address", getAddress());
        params.put("longitude", getLongitude());
        params.put("latitude", getLatitude());
        params.put("remark", getRemark());
        params.put("outSid", getOutSid());
        params.put("areaRegion", getAreaRegion());
        params.put("channelCode", getChannelCode());
        params.put("country", getCountry());
        params.put("isSyn", getIsSyn());
        params.put("zip", getZip());
        return params;
    }
}
