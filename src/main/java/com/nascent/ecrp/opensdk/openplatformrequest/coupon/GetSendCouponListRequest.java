package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.GetSendCouponListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:9:01
 * 优惠券发放日志列表
 */
@Getter
@Setter
public class GetSendCouponListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetSendCouponListResponse> {

    /**
     * 优惠券Id（大类）
     */
    private String nick;

    /**
     * 平台类型
     */
    private Integer nickType;

    /**
     * 会员用户Id
     * 	当nick和nickType，与customerId不能同时为空
     */
    private Long customerId;

    /**
     * 优惠券Id（大类）
     * 非必填
     */
    private String couponCode;

    /**
     * 起始时间
     * yyyy-MM-dd HH:mm:ss （发放创建时间）
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 页码
     */
    private Integer pageNo = 1;

    /**
     * 页面大小
     */
    private Integer pageSize = 15;

    /**
     * 优惠券Id（大类）
     */
    private Boolean returnTotal = false;

    /**
     * 使用情况
     * 0：未使用1：使用中 2：已使用'
     */
    private Integer useStatus;

    public String GetApiName() {
        return "/openApi/send/getSendCouponList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetSendCouponListResponse> getResponseClass() {
        return GetSendCouponListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponCode",this.getCouponCode());
        params.put("customerId",this.getCustomerId());
        params.put("endTime",this.getEndTime());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("returnTotal",this.getReturnTotal());
        params.put("startTime",this.getStartTime());
        params.put("useStatus",this.getUseStatus());
        return params;
    }


}
