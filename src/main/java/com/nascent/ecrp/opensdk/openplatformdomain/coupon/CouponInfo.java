package com.nascent.ecrp.opensdk.openplatformdomain.coupon;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:16:44
 * 已发放的优惠券信息
 * 所在接口：优惠券发放日志列表
 */
@Setter
@Getter
public class CouponInfo {

    /**
     * 品牌编号
     */
    private Long brandId;

    /**
     * 渠道详细名称
     */
    private String channel;

    /**
     * 用户唯一标识
     */
    private Long customerId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 失效时间
     */
    private String endTime;

    /**
     * 扩展字段
     */
    private String extJson;

    /**
     * 集团编号
     */
    private Long groupId;

    /**
     * 店铺帐号
     * 淘宝存sellernick，京东存登录账号
     */
    private String outSid;

    /**
     * 发送渠道编号
     */
    private Integer sendChannelId;

    /**
     * 优惠券发送渠道
     * 	1：导购，2：活动，3：门店领取
     */
    private Integer sendChannelType;

    /**
     * 发券时间
     */
    private String sendTime;

    /**
     * 成单导购，导购专用
     */
    private Integer sgGuideId;

    /**
     * 店铺编号
     */
    private Long shopId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 生效时间
     */
    private String startTime;

    /**
     * 门店优惠券代号（大类编号）
     */
    private String storeCouponCode;

    /**
     * 每张优惠券编号
     */
    private String storeCouponDetailNo;

    /**
     * 门店优惠券唯一标识
     */
    private Long storeCouponId;

    /**
     * 使用订单id
     */
    private Long tradeId;

    /**
     * 使用人姓名
     */
    private String useCustomerName;

    /**
     * 使用状态
     */
    private Integer useStatus;

    /**
     * 使用时间
     */
    private String useTime;

}
