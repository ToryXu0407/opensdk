package com.nascent.ecrp.opensdk.openplatformdomain.trade;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:14:48
 */
@Getter
@Setter
public class OrdersInfo {

    /**
     *多个子订单
     */
    private String bindOids;

    /**
     *分摊之后的实付金额
     */
    private BigDecimal divideOrderFee;

    /**
     *集团Id
     */
    private Long groupId;

    /**
     *卖家优惠金额
     */
    private BigDecimal orderAdjustFee;

    /**
     *买家是否已评价
     */
    private Boolean orderBuyerRate;

    /**
     *交易商品对应的类目ID
     */
    private String orderCid;

    /**
     *子订单的发货时间
     */
    private String orderConsignTime	;

    /**
     *折价金额
     */
    private BigDecimal orderDiscountFee;

    /**
     *子订单交易完成时间
     */
    private String orderEndTime;

    /**
     *子订单来源
     */
    private String orderFrom;

    /**
     *是否超卖
     */
    private Boolean orderIsoversold;

    /**
     *商品数量
     */
    private BigDecimal orderNum;

    /**
     *付款金额
     */
    private BigDecimal orderPayment;

    /**
     *价格
     */
    private BigDecimal orderPrice;

    /**
     *卖家是否已评价
     */
    private Boolean orderSellerRate;

    /**
     *子订单的运送方式
     */
    private String orderShippingType;

    /**
     *订单状态
     */
    private String orderStatus;

    /**
     *总金额
     */
    private BigDecimal orderTotalFee;

    /**
     *子订单交易类型
     */
    private String orderType;

    /**
     *外部商品ID
     */
    private String outItemId;

    /**
     *外部订单ID
     */
    private String outOrderId;

    /**
     *退款ID
     */
    private String outRefundId;

    /**
     *商家编码
     */
    private String outerId;

    /**
     *图片路径
     */
    private String picPath;

    /**
     *退换状态
     */
    private String refundStatus;

    /**
     *店铺Id
     */
    private String shopId;

    /**
     *skuId
     */
    private String skuId;

    /**
     *sku属性
     */
    private String skuProperties;

    /**
     *超时到期时间
     */
    private String timeoutActionTime;

    /**
     *标题
     */
    private String title;


}
