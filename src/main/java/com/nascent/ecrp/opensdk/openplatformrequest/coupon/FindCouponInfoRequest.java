package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.FindCouponInfoResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:49
 * 优惠券查询详情
 */
@Getter
@Setter
public class FindCouponInfoRequest extends OpenPlatformBaseRequest
        implements BaseRequest<FindCouponInfoResponse> {

    /**
     * 优惠券Id（大类）
     * 必填
     */
    private String couponCode;

    /**
     * 各种状态的统计情况
     * （0：未使用（已发放）1：使用中 2：已使用）默认不统计，true全统计
     */
    private Boolean returnCount;

    public String GetApiName() {
        return "/openApi/query/findCouponInfo";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<FindCouponInfoResponse> getResponseClass() {
        return FindCouponInfoResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponCode",this.getCouponCode());
        params.put("returnCount",this.getReturnCount());
        return params;
    }



}
