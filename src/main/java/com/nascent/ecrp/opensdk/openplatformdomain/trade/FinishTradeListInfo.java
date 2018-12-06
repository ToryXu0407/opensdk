package com.nascent.ecrp.opensdk.openplatformdomain.trade;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:15:30
 * 用于getFinishTradeList接口响应 订单字段
 */
@Setter
@Getter
public class FinishTradeListInfo {

    /**
     *客户姓名
     */
    private String customerName;

    /**
     *交易完成时间(Date)
     */
    private Date endTime;

    /**
     *客户专属导购id
     */
    private Long guideId;

    /**
     *商品数量(BigDecimal)
     */
    private BigDecimal num;

    /**
     *成单导购id(Integer)
     */
    private Integer orderGuideId;

    /**
     *物流公司名称
     */
    private String outCompanyName;

    /**
     *运单号
     */
    private String outSid;

    /**
     *外部订单Id
     */
    private String outTradeId;

    /**
     *订单实付金额(BigDecimal)
     */
    private BigDecimal payment;

    /**
     *交易平台(Integer)
     */
    private Integer platform;

    /**
     *邮费(BigDecimal)
     */
    private BigDecimal postFee;

    /**
     *退款状态(Integer)
     */
    private Integer refundStatus;

    /**
     *物流方式
     */
    private String shippingType;

    /**
     *内部店铺Id(Long)
     */
    private Long shopId;

    /**
     *内部会员Id(Long)
     */
    private Long sysCustomerId;

    /**
     *系统商品id
     */
    private String sysItemIds;

    /**
     *系统订单Id(Long)
     */
    private Long sysTradeId;

    /**
     *商品标题
     */
    private String titles;

    /**
     *商品总金额(BigDecimal)
     */
    private BigDecimal totalFee;

    /**
     *订单来源
     */
    private String tradeFrom;

    /**
     *交易状态
     */
    private String tradeStatus;


}
