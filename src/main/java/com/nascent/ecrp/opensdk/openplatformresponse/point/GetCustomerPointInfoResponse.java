package com.nascent.ecrp.opensdk.openplatformresponse.point;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.point.PointInfo;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:23
 * 用于查询积分接口响应
 */
@Getter
@Setter
public class GetCustomerPointInfoResponse extends BaseResponse {

    /**
     * 积分
     */
    private PointInfo point;

    /**
     * total
     */
    private Integer total;
}
