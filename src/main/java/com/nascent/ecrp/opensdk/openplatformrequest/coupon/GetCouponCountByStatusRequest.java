package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.GetCouponCountByStatusResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:8:46
 * 查询个人各种状态的优惠券统计数量(使用中,已使用,有效,已过期,暂不可用)
 */
@Setter
@Getter
public class GetCouponCountByStatusRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetCouponCountByStatusResponse> {
    /**
     * 会员用户Id（long）
     * （nick，nickType）与customerId 不能同时为空
     */
    private Long customerId;

    /**
     * 是否返回暂不可用优惠券数量(未到使用时间)
     * （futureUsable，overdue，usable，used，using）不能同时为空
     */
    private Boolean futureUsable;

    /**
     * 昵称
     * （nick，nickType）与customerId 不能同时为空
     */
    private String nick;

    /**
     * 平台编码（int）
     * （nick，nickType）与customerId 不能同时为空
     */
    private Integer nickType;

    /**
     * 是否返回过期优惠券数量
     * （futureUsable，overdue，usable，used，using）不能同时为空
     */
    private Boolean overdue;

    /**
     * 是否返回可用优惠券数量
     * （futureUsable，overdue，usable，used，using）不能同时为空
     */
    private Boolean usable;

    /**
     * 是否返回已使用优惠券数量
     * （futureUsable，overdue，usable，used，using）不能同时为空
     */
    private Boolean used;

    /**
     * 是否返回使用中优惠券数量
     * （futureUsable，overdue，usable，used，using）不能同时为空
     */
    private Boolean using;

    public String GetApiName() {
        return "/openApi/query/getCouponCountByStatus";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCouponCountByStatusResponse> getResponseClass() {
        return GetCouponCountByStatusResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("customerId",this.getCustomerId());
        params.put("futureUsable",this.getFutureUsable());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("overdue",this.getOverdue());
        params.put("usable",this.getUsable());
        params.put("used",this.getUsed());
        params.put("using",this.getUsing());
        return params;
    }



}
