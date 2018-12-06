package com.nascent.ecrp.opensdk.openplatformdomain.coupon;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:17:06
 * 发放优惠券结果集
 * 所在接口：查询批量发放优惠券结果集
 */
@Setter
@Getter
public class CouponResultInfo {

    /**
     * 使用订单id
     */
    private Long customerId;

    /**
     * 发放结果	1成功，0失败
     */
    private Integer resultType;


}
