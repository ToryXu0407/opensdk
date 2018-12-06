package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.CheckCouponCanUseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:19:05
 * .查询小类优惠券是否可用
 */
@Getter
@Setter
public class CheckCouponCanUseRequest extends OpenPlatformBaseRequest
        implements BaseRequest<CheckCouponCanUseResponse> {

    /**
     * 小类优惠券编码
     */
    private Long couponId;

    public String GetApiName() {
        return "/openApi/query/checkCouponCanUse";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<CheckCouponCanUseResponse> getResponseClass() {
        return CheckCouponCanUseResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponId",this.getCouponId());
        return params;
    }

}
