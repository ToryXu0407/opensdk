package com.nascent.ecrp.opensdk.openplatformdomain.trade;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:14:53
 */
@Getter
@Setter
public class ServiceOrdersInfo {

    /**
     *买家昵称
     */
    private String buyerNick	;

    /**
     *etPlateNumber
     */
    private String etPlateNumber;

    /**
     *etSerTime
     */
    private String etSerTime;

    /**
     *etShopName
     */
    private String etShopName	;

    /**
     *etVerifiedShopName
     */
    private String etVerifiedShopName;

    /**
     *服务所属的交易订单号
     */
    private Long itemOid;

    /**
     *购买数量，取值范围为大于0的整数
     */
    private Long num	;

    /**
     *虚拟服务子订单订单号
     */
    private Long oid	;

    /**
     *oidStr
     */
    private String oidStr	;

    /**
     *	子订单实付金额
     */
    private String payment	;

    /**
     *服务图片地址
     */
    private String picPath	;

    /**
     *	服务价格
     */
    private String price	;

    /**
     *	最近退款的id
     */
    private Long refundId	;

    /**
     *	卖家昵称
     */
    private String sellerNick	;

    /**
     *服务详情的URL地址
     */
    private String serviceDetailUrl	;

    /**
     *服务数字id
     */
    private Long serviceId	;

    /**
     *	商品名称
     */
    private String title	;

    /**
     *tmserSpuCode
     */
    private String tmserSpuCode	;

    /**
     *商品总金额
     */
    private BigDecimal totalFee	;


}
