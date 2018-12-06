package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.CancelCouponResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:17:20
 * 优惠券核销
 */
@Getter
@Setter
public class CancelCouponRequest extends OpenPlatformBaseRequest
        implements BaseRequest<CancelCouponResponse> {

    /**
     * 优惠券Id（小类）
     */
    private Long couponId;

    /**
     * 用户Id
     */
    private Long customerId;

    /**
     * 成单导购
     */
    private Long guideId;

    /**
     * 平台id
     */
    private Integer nick;

    /**
     * 平台类型
     */
    private Boolean nickType;

    /**
     * （外部）店铺Id
     */
    private String outSid;

    /**
     * （内部）店铺编号
     */
    private Integer shopId;

    /**
     * 订单Id
     */
    private Long tradeId;

    public String GetApiName() {
        return "/openApi/cancel/cancelCoupon";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<CancelCouponResponse> getResponseClass() {
        return CancelCouponResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponId",this.getCouponId());
        params.put("customerId",this.getCustomerId());
        params.put("guideId",this.getGuideId());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("outSid",this.getOutSid());
        params.put("shopId",this.getShopId());
        params.put("tradeId",this.getTradeId());
        return params;
    }



}
