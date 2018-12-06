package com.nascent.ecrp.opensdk.openplatformdomain.customer;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:15:54
 * 会员信息
 * 所在接口：获取专属导购id不为空的会员列表
 */
@Getter
@Setter
public class CustomerInfo {

    /**
     * 视角Id (Long)
     */
    private Long brandId;

    /**
     * 会员注册时间
     */
    private String createTime;

    /**
     * 会员姓名
     */
    private String customerName;

    /**
     * 专属导购id (Integer)
     */
    private Integer sgGuideId;

    /**
     * 客户来源(Integer)
     */
    private Integer sgRecruitState;

    /**
     * 招募门店id (Long)
     */
    private Long sgShopId;

    /**
     * 会员Id
     */
    private Long sysCustomerId;

    /**
     * 微信unionid（全小写）
     */
    private String unionid;

}
