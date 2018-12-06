package com.nascent.ecrp.opensdk.openplatformdomain.coupon;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:18:23
 * 优惠券列表信息
 * 所在接口：优惠券查询列表
 */
@Setter
@Getter
public class CouponInfoListInfo {

    /**
     * 领取N天后生效
     */
    private Integer afterGetValidDays;

    /**
     * 视角Id
     */
    private Long brandId;

    /**
     * 冻结优惠券数量
     */
    private String couponFreezeAmount;

    /**
     * 优惠券创建时间
     */
    private String createTime;

    /**
     * 有效时间类型。
     */
    private Integer dateValidType;

    /**
     * 优惠券的截止时间
     */
    private String endTime;

    /**
     * 兑换礼品
     */
    private String giftJson;

    /**
     * 集团ID
     */
    private Long groupId;

    /**
     * @mock=$order('20','20','20','20','20')
     */
    private Long hadIssueAmount;

    /**
     *
     */
    private Long id;

    /**
     * 不可用日期
     */
    private String invalidDate;

    /**
     * 最大发放量
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
     * 门店优惠券代号
     */
    private String storeCouponCode;

    /**
     * 门店优惠券价格，单位：元
     */
    private BigDecimal storeCouponPrice;

    /**
     * 门店优惠券状态（1：启用，0：禁用）
     */
    private Integer storeCouponStatus;

    /**
     * 门店优惠券主题
     */
    private String storeCouponTitle;

    /**
     * 门店优惠券类型（0：未知，1：代金券、2：折扣券、3：兑换券）
     */
    private Integer storeCouponType;

    /**
     * 门店优惠券面值，单位：元\r\n 当store_coupon_type为1时，此框标识优惠券面额\r\n
     * 当store_coupon_type为2时，此框表示折扣值，8.5折请存0.85
     */
    private BigDecimal storeCouponValue;

    /**
     * 单数限制，0：表示不限，N表示第几单可用
     */
    private Long tradeCountValid;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 使用条件：eg：{type:0,condition:{ tradeAmount:20,logic:"and",itemAmount:10}}
     * \r\n 备注：\r\n type:0:无门槛，1：订单或者商品，2：同一订单同一商品
     * \r\n 当type=0时，condition内容无效
     * \r\n 当type=1时，condition为：{tradeAmount:20,logic:"and",itemAmount:10 }\
     * r\n 当type=2时，condition为：{itemCount:2}
     */
    private String useConditionJson;

    /**
     * 使用范围
     */
    private String useRange;

    /**
     * 有效天数
     */
    private Integer validDays;

    /**
     * 可用时段：eg:{type:0,timeRange:{startTime:"09:20",endTime:"22:33"}}\r\n 备注：\r\n type,0:全部时段，1：部分时段
     * \r\n 当type=0时，timeRange 无效
     * \r\n 当type=1时，timeRange={startTime:"09:20",endTime:"22:33"}
     */
    private String validTime;


}
