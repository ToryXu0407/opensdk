package com.nascent.ecrp.opensdk.openplatformresponse.coupon;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:8:54
 * 优惠券发放（批量预冻结发放）
 */
@Setter
@Getter
public class SendFreSendCouponListResponse extends BaseResponse {

    /**
     * 失败数量
     */
    private Integer failedCount;

    /**
     * 成功数量
     */
    private Integer successCount;

}
