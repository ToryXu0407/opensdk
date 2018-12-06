package com.nascent.ecrp.opensdk.openplatformrequest.coupon;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.GetCouponResultListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:17:08
 * 查询批量发放优惠券结果集
 */
@Getter
@Setter
public class GetCouponResultListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetCouponResultListResponse> {
    /**
     * 优惠券编码（大类）
     */
    private String couponCode;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 页面大小
     */
    private Integer pageSize;

    /**
     * 成功失败的标识
     * 1 成功 0失败 不传为查询所有
     */
    private Integer resultType;

    /**
     * 是否查询详情
     * true查询成功list+失败list+数量，false只查询数量
     */
    private Boolean returnDetail;

    public String GetApiName() {
        return "/openApi/send/getCouponResultList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCouponResultListResponse> getResponseClass() {
        return GetCouponResultListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("couponCode",this.getCouponCode());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("resultType",this.getResultType());
        params.put("returnDetail",this.getReturnDetail());
        return params;
    }


}
