package com.nascent.ecrp.opensdk.openplatformdomain.coupon;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:56
 * 优惠券是否可用信息
 * 所在接口：查询小类优惠券是否可用
 */
@Setter
@Getter
public class CheckCouponInfo {

    /**
     * 领取N天后生效
     */
    private Long afterGetValidDays;

    /**
     * brandId
     */
    private Long brandId;

    /**
     * 大类优惠券code
     */
    private String CouponCode;

    /**
     *
     */
    private Integer CouponStatus;

    /**
     *
     */
    private String CouponTitle;

    /**
     *
     */
    private Integer CouponType;

    /**
     *
     */
    private BigDecimal CouponValue;

    /**
     * 冻结优惠券数量
     */
    private Long coupon_freeze_amount;

    /**
     * 有效时间类型。0：固定，1：相对\r\n 为0时，
     * start_time和end_time有效\r\n 为1时，after_get_valid_days和valid_days有效
     */
    private Integer dateValidType;

    /**
     * 优惠券的截止时间
     */
    private String endTime;

    /**
     * 兑换礼品:
     * eg:[{itemId:21212,itemName:"美的小风扇",Count:1},{itemId:43342,itemName:"海尔冰箱",Count:2}]
     */
    private String giftJson;

    /**
     * @mock=0
     */
    private Long groupId;

    /**
     * 已发行量
     */
    private Long hadIssueAmount;

    /**
     * @mock=6
     */
    private Long id;

    /**
     * 不可用日期：
     * eg:{type:0,dayList:["02-01","03-02","04-05","04-10"]}
     * \r\n 备注：\r\n type,0:不限，1：指定日期\r\n 当type=0时，
     * dayList 无效\r\n 当type=1时，dayList=["02-01","03-02","04-05","04-10"]
     */
    private String invalidDate;

    /**
     * 最大发放量。0：表示无限量
     */
    private Long maxIssueAmount;

    /**
     * 每人最大领取张数(默认0的话 无限量)
     */
    private Long maxIssueCount;

    /**
     * 备注
     */
    private String remark;


    /**
     * 优惠券的生效时间
     */
    private String startTime;

    /**
     * 单数限制，0：表示不限，N表示第几单可用
     */
    private Long tradeCountValid;

    /**
     * 使用条件
     */
    private String useCondition;

    /**
     * 使用范围
     */
    private String useRange;

    /**
     * 有效天数
     */
    private Integer validDays;

    /**
     * 可用时段
     */
    private String validTime;


}
