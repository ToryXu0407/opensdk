package com.nascent.ecrp.opensdk.openplatformresponse.coupon;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:8:50
 * 优惠券发放（单发预冻结发放）
 */
@Setter
@Getter
public class SendFreSendCouponResponse extends BaseResponse {

    /**
     * 优惠券编码（小类）
     */
    private String storeCouponDetailNo;


}
