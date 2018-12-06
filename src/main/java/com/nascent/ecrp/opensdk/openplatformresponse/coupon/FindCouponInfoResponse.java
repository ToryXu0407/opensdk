package com.nascent.ecrp.opensdk.openplatformresponse.coupon;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.coupon.StoreCouponInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:33
 * 优惠券查询详情
 */
@Getter
@Setter
public class FindCouponInfoResponse extends BaseResponse {

    /**
     * 已核销数量
     */
    private Long cancelCount;

    /**
     * 已发放数量
     */
    private Long issuedCount;

    /**
     * 优惠券
     */
    private StoreCouponInfo storeCoupon;

    /**
     * 未使用数量
     */
    private Long unUseCount;

    /**
     * 使用中数量
     */
    private Long usingCount;

}
