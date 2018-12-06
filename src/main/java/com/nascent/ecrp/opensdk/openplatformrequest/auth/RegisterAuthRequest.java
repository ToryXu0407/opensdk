package com.nascent.ecrp.opensdk.openplatformrequest.auth;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.auth.RegisterAuthResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:9:19
 * 注册授权接口
 */
@Getter
@Setter
public class RegisterAuthRequest extends OpenPlatformBaseRequest
        implements BaseRequest<RegisterAuthResponse> {

    public String GetApiName() {
        return "/openApi/auth/registerAuth";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<RegisterAuthResponse> getResponseClass() {
        return RegisterAuthResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("brandId",this.getBrandId());
        params.put("expiresTime",this.getExpiresTime());
        params.put("groupId",this.getGroupId());
        params.put("shopId",this.getShopId());
        params.put("viewShopId",this.getViewShopId());
        return params;
    }

    /**
     * 关联ECRP品牌ID
     * 必填
     */
    private Long brandId;
    /**
     * Accesstoken 过期时间（格式：yyyy-MM-dd HH:mm:ss）
     * 必填
     */
    private String expiresTime;

    /**
     * 关联集团Id
     * 必填
     */
    private Long groupId;

    /**
     * 关联的ECRP店铺ID
     * 除导购商城必填
     */
    private Long shopId;

    /**
     * 导购Id
     * 导购，商城外必填
     */
    private Long viewShopId;




}
