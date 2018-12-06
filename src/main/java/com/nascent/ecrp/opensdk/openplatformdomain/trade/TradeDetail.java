package com.nascent.ecrp.opensdk.openplatformdomain.trade;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:14:53
 * 订单详情
 */
@Setter
@Getter
public class TradeDetail {

    /**
     *支付宝交易号
     */
    private String alipayNo;

    /**
     *应用入口(Integer )
     */
    private Integer appEntrance;

    /**
     *(Integer )
     */
    private Integer auditStatus;

    /**
     *店铺归属品牌id字符串
     */
    private String brandIdsStr;

    /**
     *支付宝邮件后缀
     */
    private String buyerAlipayEmailSuffix;

    /**
     *支付宝帐号(密文)
     */
    private String buyerAlipayNo;

    /**
     *支付宝账号类型
     */
    private Integer buyerAlipayNoType;

    /**
     *买家邮箱(密文)
     */
    private String buyerEmail;

    /**
     *买家邮箱后缀
     */
    private String buyerEmailSuffix;

    /**
     *买家是否已评价
     */
    private Integer buyerRate;

    /**
     *卖家发货时间(Date)
     */
    private Date consignTime;

    /**
     *使用的优惠券id
     */
    private String couponId;

    /**
     *优惠券类型(Integer)
     */
    private Integer couponType;

    /**
     *创建时间(Date)
     */
    private Date createTime;

    /**
     *交易创建时间(Date)
     */
    private Date created;

    /**
     *优惠金额,单位：元(Decimal)
     */
    private BigDecimal discountFee;

    /**
     *交易完成时间(Date)
     */
    private Date endTime;

    /**
     *扩展备用条件
     */
    private String extCondition;

    /**
     *集团Id
     */
    private Long groupId;

    /**
     *成长值(Integer)
     */
    private Integer growthValue;

    /**
     *是否使用优惠券(Integer)
     */
    private Integer isUseCoupon;

    /**
     *交易修改时间
     */
    private String modifyTime;

    /**
     *商品购买数量(Decimal)
     */
    private BigDecimal num;

    /**
     *物流公司名称
     */
    private String outCompanyName;

    /**
     *平台买家唯一标识
     */
    private String outId;

    /**
     *平台买家昵称(密文)
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
     *物流状态时间(Date)
     */
    private Date outTime;

    /**
     *平台交易编号
     */
    private String outTradeId;

    /**
     *付款次数,第几次付款（付款几次算几次）(Integer)
     */
    private Integer payAllIndex;

    /**
     *付款次数,第几次付款（当天多次算一次）(Integer)
     */
    private Integer payIndex;

    /**
     *付款周期,距离上次付款天数(Integer)
     */
    private Integer payPeriod;

    /**
     *交易付款时间(Date)
     */
    private Date payTime;

    /**
     *付款方法(Integer)
     */
    private Integer payType;

    /**
     *付款金额(Decimal)
     */
    private BigDecimal payment;

    /**
     *平台类型
     */
    private Integer platform;

    /**
     *邮费,单位：元(Deciaml)
     */
    private BigDecimal postFee;

    /**
     *接收人地址
     */
    private String receiverAddress;

    /**
     *接收城市
     */
    private String receiverCity;

    /**
     *接收区
     */
    private String receiverDistrict;

    /**
     *收货人手机(密文)
     */
    private String receiverMobile;

    /**
     *收货人姓名(密文)
     */
    private String receiverName;

    /**
     *收货人电话(密文)
     */
    private String receiverPhone;

    /**
     *接收省份
     */
    private String receiverProvince;

    /**
     *签收时间(Date)
     */
    private Date receiverTime;

    /**
     *接收人邮政编码
     */
    private String receiverZip;

    /**
     *成单导购，导购专用(Integer)
     */
    private Integer sgGuideId;

    /**
     *成单导购门店，导购专用
     */
    private Long sgShopId;

    /**
     *物流方式
     */
    private String shippingType;

    /**
     *店铺ID
     */
    private Long shopId;

    /**
     *预售预付金额(Deciaml)
     */
    private BigDecimal stepPaidFee;

    /**
     *分阶段付款的付首款时间(Date)
     */
    private Date stepPayTime;

    /**
     *预售交易状态,见状态字段
     */
    private String stepTradeStatus;

    /**
     *系统用户唯一标识
     */
    private Long sysCustomerId;

    /**
     *系统系统内交易号
     */
    private Long sysTradeId;

    /**
     *商品总金额,单位：元(Decamal)
     */
    private BigDecimal totalFee;

    /**
     *WAP(手机);HITAO(嗨淘);TOP(TOP平台);TAOBAO(普通淘宝);JHS(聚划算)
     */
    private String tradeFrom;

    /**
     *交易状态
     */
    private String tradeStatus;

    /**
     *税费(Decimal)
     */
    private BigDecimal tradeTaxFee;

    /**
     *订单类型
     */
    private String tradeType;

    /**
     *更新时间
     */
    private String updateTime;


}
