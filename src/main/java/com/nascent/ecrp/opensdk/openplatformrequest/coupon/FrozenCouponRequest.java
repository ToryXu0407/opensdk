package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.FrozenCouponResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:51
 * 优惠券减库存（优惠券数量冻结）
 */
@Getter
@Setter
public class FrozenCouponRequest extends OpenPlatformBaseRequest
        implements BaseRequest<FrozenCouponResponse> {


    /**
     * 优惠券Id（大类）
     */
    private String couponCode;

    /**
     * 冻结的数量（int）
     */
    private Integer sendNumber;

    public String GetApiName() {
        return "/openApi/send/frozenCoupon";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<FrozenCouponResponse> getResponseClass() {
        return FrozenCouponResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponCode",this.getCouponCode());
        params.put("sendNumber",this.getSendNumber());
        return params;
    }

}
