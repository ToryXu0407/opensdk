package com.nascent.ecrp.opensdk.openplatformrequest.trade;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.trade.GetTradeListResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:13:59
 * 查询交易列表
 */
@Setter
@Getter
public class GetTradeListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetTradeListResponse> {

    /**
     *系统会员Id
     */
    private Long customerId;

    /**
     *用户昵称
     */
    private String customerName;

    /**
     *昵称
     */
    private String nick;

    /**
     *来源
     */
    private Integer nickType;

    /**
     *外部店铺编码
     */
    private String outSid;

    /**
     *页码
     */
    private Integer pageNo = 1;

    /**
     *页面大小
     */
    private Integer pageSize = 10;

    /**
     *付款结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String payEndTime;

    /**
     *付款金额decimal
     */
    private BigDecimal payMoneyEnd;

    /**
     *付款金额开始decimal
     */
    private BigDecimal payMoneyStart;

    /**
     *付款开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String payStartTime;

    /**
     *平台类型
     */
    private Integer platform;

    /**
     *收货人手机号
     */
    private String receiverMobile;

    /**
     *收货人姓名
     */
    private String receiverName;


    /**
     *订单类型
     */
    private String tradeType;

    /**
     *店铺ID
     */
    private Long shopId;

    /**
     * 集团编号
     */
    Long groupId;

    /**
     * 视角Id
     */
    Long brandId;

    public String GetApiName() {
        return "/openApi/tradeSelect/getTradeList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetTradeListResponse> getResponseClass() {
        return GetTradeListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("customerId",this.getCustomerId());
        params.put("customerName",this.getCustomerName());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("outSid",this.getOutSid());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("payEndTime",this.getPayEndTime());
        params.put("payMoneyEnd",this.getPayMoneyEnd());
        params.put("payMoneyStart",this.getPayMoneyStart());
        params.put("payStartTime",this.getPayStartTime());
        params.put("platform",this.getPlatform());
        params.put("receiverMobile",this.getReceiverMobile());
        params.put("receiverName",this.getReceiverName());
        params.put("shopId",this.getShopId());
        params.put("tradeType",this.getTradeType());
        params.put("groupId",this.getGroupId());
        params.put("brandId",this.getBrandId());
        return params;
    }

}
