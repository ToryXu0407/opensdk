package com.nascent.ecrp.opensdk.openplatformresponse.coupon;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:9:32
 * 优惠券发放（单发）
 */
@Setter
@Getter
public class SendOneCouponResponse extends BaseResponse {

    /**
     * 优惠券编码（小类）
     */
    private String storeCouponDetailNo;


}
