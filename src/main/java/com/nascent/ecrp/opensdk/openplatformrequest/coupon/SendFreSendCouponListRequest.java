package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.SendFreSendCouponListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:8:55
 * 优惠券发放（批量预冻结发放）
 */
@Getter
@Setter
public class SendFreSendCouponListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<SendFreSendCouponListResponse> {
    /**
     * 优惠券Id（大类）
     */
    private String couponCode;

    /**
     * 用户编号集合
     * [{ "customerId": "传输时的值", "nick": "昵称" },
     * { "customerId": "传输时的值", "nick": "昵称" },
     * { "customerId": "传输时的值", "nick": "昵称" }].customerId或nick其一不为空
     */
    private List<String> couponCustomers;

    /**
     * 扩展字段
     */
    private String extJson;

    /**
     * 平台类型（int）
     */
    private Integer nickType;

    /**
     * 店铺编号（外部）
     */
    private String outSid;


    /**
     * 发放渠道Id（int）
     * 不填默认为0
     */
    private Integer sendChannelId = 0;

    /**
     * 发放的渠道（int）
     * 不填默认为0（1：导购，2：活动，3：门店领取）
     */
    private Integer sendChannelType =0;

    public String GetApiName() {
        return "/openApi/send/sendFreSendCouponList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<SendFreSendCouponListResponse> getResponseClass() {
        return SendFreSendCouponListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponCode",this.getCouponCode());
        params.put("couponCustomers",this.getCouponCustomers());
        params.put("nickType",this.getNickType());
        params.put("outSid",this.getOutSid());
        params.put("sendChannelId",this.getSendChannelId());
        params.put("sendChannelType",this.getSendChannelType());
        params.put("extJson",this.getExtJson());
        return params;
    }


}
