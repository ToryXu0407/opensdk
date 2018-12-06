package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.FindOneCouponInfoResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:17:56
 * 优惠券查询个人列表
 */
@Setter
@Getter
public class FindOneCouponInfoRequest extends OpenPlatformBaseRequest
        implements BaseRequest<FindOneCouponInfoResponse> {

    /**
     * 优惠券状态
     * 	0：未使用1：使用中 2：已使用'
     */
    private Integer couponState;

    /**
     * 是否过期
     * 0未过期 1已过期 2暂不可用(其中为过期的优惠券包括暂不可用类型的)
     */
    private Integer couponStatus;

    /**
     * 优惠券类型
     * 0：未知，1：代金券、2：折扣券、3：兑换券
     */
    private Integer couponType;

    /**
     * 会员用户Id
     */
    private Long customerId;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 平台
     */
    private String nick;

    /**
     * 平台类型
     */
    private Integer nickType;


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

    /**
     * 起始时间
     */
    private String startTime ;

    public String GetApiName() {
        return "/openApi/query/findOneCouponInfo";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<FindOneCouponInfoResponse> getResponseClass() {
        return FindOneCouponInfoResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponState",this.getCouponState());
        params.put("couponStatus",this.getCouponStatus());
        params.put("couponType",this.getCouponType());
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
