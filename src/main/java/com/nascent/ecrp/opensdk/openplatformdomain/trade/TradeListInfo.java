package com.nascent.ecrp.opensdk.openplatformdomain.trade;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:14:39
 * 订单信息
 */
@Setter
@Getter
public class TradeListInfo {

    /**
     *是否评价
     */
    private Integer buyerRate;

    /**
     *交易创建时间
     */
    private String created;

    /**
     *会员卡号
     */
    private String memberCard;

    /**
     * 子订单结果集
     */
    private List<OrderListInfo> orderList;


    /**
     *物流公司名称
     */
    private String outCompanyName;

    /**
     *平台买家昵称(
     */
    private String outNick;

    /**
     *运单号
     */
    private String outSid;

    /**
     *快递状态
     */
    private Integer outState;

    /**
     *平台交易编号
     */
    private String outTradeId;

    /**
     *支付时间
     */
    private Date payTime;

    /**
     *支付金额
     */
    private BigDecimal payment;

    /**
     *平台类型
     */
    private Integer platform;

    /**
     *邮费
     */
    private BigDecimal postFee;

    /**
     *收货人手机
     */
    private String receiverMobile;

    /**
     *收货人姓名
     */
    private String receiverName;

    /**
     *店铺编号
     */
    private Long shopId;

    /**
     *店铺名称
     */
    private String shopName;

    /**
     *订单编号
     */
    private Long sysTradeId;

    /**
     *商品总金额,单位：元
     */
    private BigDecimal totalFee;

    /**
     *交易来源
     */
    private String tradeFrom;

    /**
     *交易状态
     */
    private String tradeStatus	;

    /**
     *订单类型
     */
    private String tradeType;

}
