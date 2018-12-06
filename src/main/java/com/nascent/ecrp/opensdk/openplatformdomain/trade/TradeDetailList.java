package com.nascent.ecrp.opensdk.openplatformdomain.trade;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:15:03
 * 子订单信息
 */
@Setter
@Getter
public class TradeDetailList {

    /**
     *创建时间(Date)
     */
    private Date createTime;

    /**
     *集团Id
     */
    private Long groupId;

    /**
     *卖家优惠金额(Decimal)
     */
    private BigDecimal orderAdjustFee;

    /**
     *买家是否已评价(Integer)
     */
    private Integer orderBindOids;

    /**
     *orderBuyerRate(Integer)
     */
    private Integer orderBuyerRate;

    /**
     *交易商品对应的类目ID
     */
    private String orderCid;

    /**
     *(Date)
     */
    private Date orderConsignTime;

    /**
     *下单时间(Date)
     */
    private Date orderCreated;

    /**
     *折价金额(Decimal)
     */
    private BigDecimal orderDiscountFee;

    /**
     *分摊之后的实付金额(Decimal)
     */
    private BigDecimal orderDivideFee;

    /**
     *(Date)
     */
    private Date orderEndtime;

    /**
     *子订单来源
     */
    private String orderFrom;

    /**
     *是否超卖(Integer)
     */
    private Integer orderIsoversold;

    /**
     *商品第几次购买(Integer)
     */
    private Integer orderItemPayindex;

    /**
     *距离上次购买间隔多少天(Integer)
     */
    private Integer orderItemPayperiod;

    /**
     *子订单发货的快递公司名称
     */
    private String orderLogisticsCompany;

    /**
     *子订单所在包裹的运单号
     */
    private String orderLogisticsNo;

    /**
     *数量(Decimal)
     */
    private BigDecimal orderNum;

    /**
     *付款金额(Decimal)
     */
    private BigDecimal orderPayment;

    /**
     *付款时间(Date)
     */
    private Date orderPaytime;

    /**
     *价格(Decimal)
     */
    private BigDecimal orderPrice;

    /**
     *退款状态。
     */
    private String orderRefundStatus;

    /**
     *卖家是否已评价
     */
    private Boolean orderSellerRate;

    /**
     *
     */
    private String orderShippingType;

    /**
     *订单状态
     */
    private String orderStatus;

    /**
     *天猫国际官网直供子订单关税税费(Decimal)
     */
    private BigDecimal orderTaxFee;

    /**
     *订单超时到期时间(Date)
     */
    private Date orderTimeoutActionTime;

    /**
     *总金额(Decimal)
     */
    private BigDecimal orderTotalFee;

    /**
     *
     */
    private String orderType;

    /**
     *外部商品ID
     */
    private String outItemId;

    /**
     *外部子订单ID
     */
    private String outOrderId;

    /**
     *退款ID
     */
    private String outRefundId;

    /**
     *外部订单Id
     */
    private String outTradeId;

    /**
     *商家编码
     */
    private String outerId;

    /**
     *图片路径
     */
    private String picPath;

    /**
     *备注
     */
    private String remark;

    /**
     *成单导购，导购专用
     */
    private Long sgGuideId;

    /**
     *成单导购门店，导购专用
     */
    private Long sgShopId;

    /**
     *店铺ID
     */
    private Long shopId;

    /**
     *店铺名称
     */
    private String shopName;

    /**
     *店铺状态
     */
    private Integer shopStatus;

    /**
     *skuid
     */
    private String skuId;

    /**
     *sku属性
     */
    private String skuProperties;

    /**
     *系统用户Id
     */
    private Long sysCustomerId;

    /**
     *系统商品Id
     */
    private Long sysItemId;

    /**
     *系统订单Id
     */
    private Long sysTradeId;

    /**
     *标题
     */
    private String title;

    /**
     *更新时间
     */
    private String updateTime;

}
