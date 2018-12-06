package com.nascent.ecrp.opensdk.openplatformresponse.coupon;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:8:53
 * 优惠券发放（批量）
 */
@Setter
@Getter
public class SendCouponListResponse extends BaseResponse {

    /**
     * 失败数量
     */
    Integer failedCount;

    /**
     * 成功数量
     */
    Integer successCount;


}
