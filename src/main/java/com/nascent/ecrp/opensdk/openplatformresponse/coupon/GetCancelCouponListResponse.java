package com.nascent.ecrp.opensdk.openplatformresponse.coupon;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.coupon.CouponInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:17:11
 * 优惠券核销日志列表
 */
@Setter
@Getter
public class GetCancelCouponListResponse extends BaseResponse {

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 页面大小
     */
    private Integer pageSize;

    /**
     * 开始数据的序号
     */
    private Integer pageStart;

    /**
     * 总数据数
     */
    private Integer pageTotal;

    /**
     * 总数据数
     */
    private List<CouponInfo> result;

}
