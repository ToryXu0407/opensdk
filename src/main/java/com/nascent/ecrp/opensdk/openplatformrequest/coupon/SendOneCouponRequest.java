package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.SendOneCouponResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:8:47
 * 优惠券发放（单发）
 */
@Getter
@Setter
public class SendOneCouponRequest extends OpenPlatformBaseRequest
        implements BaseRequest<SendOneCouponResponse> {
    /**
     * 优惠券Id（大类）
     */
    private String couponCode;

    /**
     * 扩展字段
     */
    private String extJson;


    /**
     * 用户Id（Long）
     */
    private Long customerId;

    /**
     * 平台标识码
     * nick和customerId 不可同时为null 以customerId为主
     */
    private String nick;

    /**
     * 外部店铺编号
     */
    private String outSid;

    /**
     * 平台类型（int）
     */
    private Integer nickType;

    /**
     * 发放渠道Id（int）
     * 不填默认为0
     */
    private Integer sendChannelId=0;

    /**
     * 发放的渠道（int）
     * 	不填默认会为0（1：导购，2：活动，3：门店领取）
     */
    private Integer sendChannelType=0;

    public String GetApiName() {
        return "/openApi/send/sendOneCoupon";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<SendOneCouponResponse> getResponseClass() {
        return SendOneCouponResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponCode",this.getCouponCode());
        params.put("customerId",this.getCustomerId());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("outSid",this.getOutSid());
        params.put("sendChannelId",this.getSendChannelId());
        params.put("sendChannelType",this.getSendChannelType());
        params.put("extJson",this.getExtJson());
        return params;
    }


}
