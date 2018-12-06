package com.nascent.ecrp.opensdk.openplatformrequest.shop;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.shop.GetNearbyShopListResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 查询附近门店列表请求
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class GetNearbyShopListRequest extends OpenPlatformBaseRequest implements BaseRequest<GetNearbyShopListResponse> {

    /**
     * 距离(千米）
     */
    private Integer distance;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 经度
     */
    private BigDecimal longitude;

    public String GetApiName() {
        return "/openApi/shopSelect/getNearbyShopList";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<GetNearbyShopListResponse> getResponseClass() {
        return GetNearbyShopListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("distance",this.getDistance());
        params.put("latitude",this.getLatitude());
        params.put("longitude",this.getLongitude());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }
}
