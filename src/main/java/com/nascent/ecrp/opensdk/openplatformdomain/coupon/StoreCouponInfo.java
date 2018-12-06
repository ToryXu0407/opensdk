package com.nascent.ecrp.opensdk.openplatformdomain.coupon;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:38
 * 优惠券详情
 * 所在接口：优惠券查询详情
 */
@Getter
@Setter
public class StoreCouponInfo {

    /**
     * 领取N天后生效
     */
    private String afterGetValidDays;

    /**
     * brandId
     */
    private Long brandId;

    /**
     * 冻结优惠券数量
     */
    private Long couponFreezeAmount;

    /**
     * 创建时间
     */
    private String createTime;

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
    private String id;

    /**
     * 不可用日期：
     * eg:{type:0,dayList:["02-01","03-02","04-05","04-10"]}
     * \r\n 备注：\r\n type,0:不限，1：指定日期\r\n 当type=0时，
     * dayList 无效\r\n 当type=1时，dayList=["02-01","03-02","04-05","04-10"]
     */
    private String invalidDate;

    /**
     * 不可用时间段
     */
    private String invalidDateStr;

    /**
     * 商品使用范围
     */
    private String itemRangeStr;

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
     * 店铺使用范围Str
     */
    private String shopRangeStr;

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
     * 门店优惠券类型（0：未知，1：代金券、2：折扣券、3：兑换券)
     */
    private Integer storeCouponType;

    /**
     * 门店优惠券面值，
     * 单位：元\r\n 当store_coupon_type为1时，
     * 此框标识优惠券面额\r\n 当store_coupon_type为2时，此框表示折扣值，8.5折请存0.85
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
     * 使用条件：
     * eg：{type:0,condition:{ tradeAmount:20,logic:"and",itemAmount:10}}
     * \r\n 备注：\r\n type:0:无门槛，1：订单或者商品，2：同一订单同一商品\r\n
     * 当type=0时，condition内容无效\r\n
     * 当type=1时，condition为：{tradeAmount:20,logic:"and",itemAmount:10 }\r\n
     * 当type=2时，condition为：{itemCount:2}
     */
    private String useConditionJson;

    /**
     * 使用条件
     */
    private String useConditionStr;

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

    /**
     * 有效时段Str
     */
    private String validTimeStr;


}
