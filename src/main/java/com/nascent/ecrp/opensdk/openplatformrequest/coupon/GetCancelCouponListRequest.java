package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.GetCancelCouponListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:9:01
 * 优惠券核销日志列表
 */
@Getter
@Setter
public class GetCancelCouponListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetCancelCouponListResponse> {

    /**
     * 平台
     */
    private String nick;

    /**
     * 平台类型
     */
    private Integer nickType;

    /**
     * 会员用户Id
     */
    private Long customerId;

    /**
     * 优惠券Id（大类）
     */
    private String couponCode;

    /**
     * 起始时间
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
     * 是否返回总数
     */
    private Boolean returnTotal = false;

    public String GetApiName() {
        return "/openApi/cancel/getCancelCouponList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCancelCouponListResponse> getResponseClass() {
        return GetCancelCouponListResponse.class;
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
        return params;
    }






}
