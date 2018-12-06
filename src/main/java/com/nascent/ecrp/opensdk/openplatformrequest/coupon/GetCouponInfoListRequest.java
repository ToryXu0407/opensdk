package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.GetCouponInfoListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:18:47
 * 优惠券查询列表
 */
@Getter
@Setter
public class GetCouponInfoListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetCouponInfoListResponse> {
    /**
     * 优惠券状态
     * 1：启用，0：禁用
     */
    private Integer couponState;

    /**
     * 是否过期
     * 0未过期 1已过期 2暂不可用（相对时间优惠券无咱不可用类型）
     */
    private Integer couponStatus;

    /**
     * 优惠券类型
     * 0：未知，1：代金券、2：折扣券、3：兑换券
     */
    private Integer couponType;

    /**
     * Integer,有效时间类型
     * 0:绝对时间,1:相对时间,不填则查询所有
     */
    private Integer dateValidType;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 页码
     * 页码,若要查询所有请填负值
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
        return "/openApi/query/getCouponInfoList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCouponInfoListResponse> getResponseClass() {
        return GetCouponInfoListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponState",this.getCouponState());
        params.put("couponStatus",this.getCouponStatus());
        params.put("couponType",this.getCouponType());
        params.put("dateValidType",this.getDateValidType());
        params.put("endTime",this.getEndTime());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("returnTotal",this.getReturnTotal());
        params.put("startTime",this.getStartTime());
        return params;
    }



}
