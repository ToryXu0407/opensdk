package com.nascent.ecrp.opensdk.openplatformrequest.auth;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.auth.GetShopListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:12:50
 * 查询店铺列表接口
 */
@Getter
@Setter
public class GetShopListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetShopListResponse> {
    public String GetApiName() {
        return "/openApi/auth/getShopList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetShopListResponse> getResponseClass() {
        return GetShopListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("groupId",this.getGroupId());
        params.put("brandId",this.getBrandId());
        return params;
    }

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     *集团ID
     */
    private Long groupId;

}
