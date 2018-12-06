package com.nascent.ecrp.opensdk.openplatformresponse.coupon;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:8:44
 * 查询个人各种状态的优惠券统计数量(使用中,已使用,有效,已过期,暂不可用)
 */
@Setter
@Getter
public class GetCouponCountByStatusResponse extends BaseResponse {

    /**
     * 暂不可用优惠券数量(未到使用时间)
     */
    private Long futureUsable;

    /**
     * 过期优惠券数量
     */
    private  Long overdue;

    /**
     * 可用优惠券数量
     */
    private Long usable;

    /**
     * 已使用优惠券数量
     */
    private Long used;

    /**
     * 使用中优惠券数量
     */
    private Long using;

}
