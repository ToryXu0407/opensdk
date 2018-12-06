package com.nascent.ecrp.opensdk.openplatformdomain.trade;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:14:14
 * 子订单信息
 */
@Getter
@Setter
public class OrderListInfo {

    /**
     *订单商品数量
     */
    private Integer orderNum;

    /**
     *支付价格
     */
    private BigDecimal orderPayment;

    /**
     *单件价格
     */
    private String orderPrice;

    /**
     *商品图片地址
     */
    private String picPath;

    /**
     *商品编码
     */
    private String skuId;

    /**
     *商品属性
     */
    private String skuProperties;

    /**
     *订单标题
     */
    private String title;

}
