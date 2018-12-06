package com.nascent.ecrp.opensdk.openplatformrequest.trade;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformdomain.trade.OrdersInfo;
import com.nascent.ecrp.opensdk.openplatformdomain.trade.PromotionDetailsInfo;
import com.nascent.ecrp.opensdk.openplatformdomain.trade.ServiceOrdersInfo;
import com.nascent.ecrp.opensdk.openplatformresponse.trade.TradeSaveResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:13:42
 * 保存订单到缓存
 */
@Getter
@Setter
public class TradeSaveRequest extends OpenPlatformBaseRequest
        implements BaseRequest<TradeSaveResponse> {

    /**
     *支付宝交易号
     */
    private String alipayNo;

    /**
     *为空为非处方药 不为空 0未审核，1、审核完成 2、审核未通过为空为非处方药 不为空
     */
    private Integer auditStatus;

    /**
     *支付宝账号
     */
    private String buyerAlipayNo;

    /**
     *买家邮箱
     */
    private String buyerEmail;

    /**
     *买家留言
     */
    private String buyerMessage;

    /**
     *买家获得积分
     */
    private BigDecimal buyerObtainPointFee;

    /**
     *买家是否已评价
     */
    private Boolean buyerRate;

    /**
     *收货时间
     */
    private String consignTime;

    /**
     *使用的优惠券ID
     */
    private String couponId;

    /**
     *优惠券类型（0：未知，1：线上优惠券，2：门店优惠券）
     */
    private Integer couponType;

    /**
     *下单时间
     */
    private String created;

    /**
     *优惠金额
     */
    private BigDecimal discountFee;

    /**
     *交易完成时间
     */
    private String endTime;

    /**
     *是否使用优惠券是否使用优惠券（0：否，1：是）
     */
    private Integer isUseCoupon;

    /**
     *会员卡号
     */
    private String memberCard;

    /**
     *交易修改时间
     */
    private String modifyTime;

    /**
     *商品购买数量
     */
    private Integer num;

    /**
     *物流公司
     */
    private String orderLogisticsCompany;

    /**
     *运单号
     */
    private String orderLogisticsNo;

    /**
     *子订单的运送方式
     */
    private String orderShippingType;

    /**
     *店铺ID
     */
    private Long shopId;

    /**
     * 子订单信息
     */
    private List<OrdersInfo> orders;

    /**
     *外部店铺Id
     */
    private String outId;

    /**
     *买家昵称
     */
    private String outNick;

    /**
     *订单号
     */
    private String outTradeId;

    /**
     *付款时间
     */
    private String payTime;

    /**
     *付款方式, Integer
     */
    private Integer payType	;

    /**
     *付款金额
     */
    private BigDecimal payment;

    /**
     *平台类型, Integer
     */
    private Integer platform;

    /**
     *邮费
     */
    private BigDecimal postFee;

    /**
     *优惠券详情
     */
    private List<PromotionDetailsInfo> promotionDetailInfos;

    /**
     *接收人地址
     */
    private String receiverAddress;

    /**
     *收货城市
     */
    private String receiverCity;

    /**
     *收货区
     */
    private String receiverDistrict;

    /**
     *收货人手机号码
     */
    private String receiverMobile;

    /**
     *收货人姓名
     */
    private String receiverName	;

    /**
     *收货人电话
     */
    private String receiverPhone;

    /**
     *收货省份
     */
    private String receiverProvince;

    /**
     *接收人邮政编号
     */
    private String receiverZip	;

    /**
     *备注旗帜, Integer
     */
    private Integer remarkSign	;

    /**
     *卖家备注
     */
    private String sellerMemo;

    /**
     *卖家昵称
     */
    private String sellerNick;

    /**
     *服务子订单
     */
    private List<ServiceOrdersInfo> serviceOrderInfos;

    /**
     *物流方式
     */
    private String shippingType;


    /**
     *预售预付金额
     */
    private BigDecimal stepPaidFee;

    /**
     *分阶段付款的付首款时间
     */
    private String stepPayTime	;

    /**
     *预售交易状态
     */
    private String stepTradeStatus;

    /**
     *交易标题
     */
    private String title;

    /**
     *总金额
     */
    private BigDecimal totalFee	;

    /**
     *交易订单来源
     */
    private String tradeFrom;

    /**
     *交易状态
     */
    private String tradeStatus;

    /**
     *订单类型
     */
    private String tradeType;

    /**
     * 集团编号
     */
    Long groupId;

    /**
     * 视角Id
     */
    Long brandId;

    public String GetApiName() {
        return "/openApi/tradeInsert/tradeSave";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<TradeSaveResponse> getResponseClass() {
        return TradeSaveResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("alipayNo",this.getAlipayNo());
        params.put("auditStatus",this.getAuditStatus());
        params.put("buyerAlipayNo",this.getBuyerAlipayNo());
        params.put("buyerEmail",this.getBuyerEmail());
        params.put("buyerMessage",this.getBuyerMessage());
        params.put("buyerObtainPointFee",this.getBuyerObtainPointFee());
        params.put("buyerRate",this.getBuyerRate());
        params.put("consignTime",this.getConsignTime());
        params.put("couponId",this.getCouponId());
        params.put("couponType",this.getCouponType());
        params.put("created",this.getCreated());
        params.put("discountFee",this.getDiscountFee());
        params.put("endTime",this.getEndTime());
        params.put("groupId",this.getGroupId());
        params.put("isUseCoupon",this.getIsUseCoupon());
        params.put("memberCard",this.getMemberCard());
        params.put("modifyTime",this.getModifyTime());
        params.put("num",this.getNum());
        params.put("orderLogisticsCompany",this.getOrderLogisticsCompany());
        params.put("orderLogisticsNo",this.getOrderLogisticsNo());
        params.put("orderShippingType",this.getOrderShippingType());
        params.put("orders",this.getOrders());
        params.put("outId",this.getOutId());
        params.put("outNick",this.getOutNick());
        params.put("outTradeId",this.getOutTradeId());
        params.put("payTime",this.getPayTime());
        params.put("payType",this.getPayType());
        params.put("payment",this.getPayment());
        params.put("platform",this.getPlatform());
        params.put("postFee",this.getPostFee());
        params.put("promotionDetails",this.getPromotionDetailInfos());
        params.put("receiverAddress",this.getReceiverAddress());
        params.put("receiverCity",this.getReceiverCity());
        params.put("receiverDistrict",this.getReceiverDistrict());
        params.put("receiverMobile",this.getReceiverMobile());
        params.put("receiverName",this.getReceiverName());
        params.put("receiverPhone",this.getReceiverPhone());
        params.put("receiverProvince",this.getReceiverProvince());
        params.put("receiverZip",this.getReceiverZip());
        params.put("remarkSign",this.getRemarkSign());
        params.put("sellerMemo",this.getSellerMemo());
        params.put("sellerNick",this.getSellerNick());
        params.put("serviceOrders",this.getServiceOrderInfos());
        params.put("shippingType",this.getShippingType());
        params.put("shopId",this.getShopId());
        params.put("stepPaidFee",this.getStepPaidFee());
        params.put("stepPayTime",this.getStepPayTime());
        params.put("stepTradeStatus",this.getStepTradeStatus());
        params.put("title",this.getTitle());
        params.put("totalFee",this.getTotalFee());
        params.put("tradeFrom",this.getTradeFrom());
        params.put("tradeStatus",this.getTradeStatus());
        params.put("tradeType",this.getTradeType());
        params.put("groupId",this.getGroupId());
        params.put("brandId",this.getBrandId());
        return params;
    }

    @Override
    public String toString() {
        return "?" +
                "groupId=" + groupId +
                "&brandId=" + brandId ;
    }

}
