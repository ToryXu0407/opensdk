package com.nascent.ecrp.opensdk.openplatformresponse.point;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:16:04
 * 用于 积分扣减接口 响应
 */
@Getter
@Setter
public class ReduceIntegralResponse extends BaseResponse {

    /**
     * 可用积分
     */
    private BigDecimal availPoint;

    /**
     * 冻结积分
     */
    private BigDecimal frozenPoint;

    /**
     * 总获得积分
     */
    private BigDecimal totalGetPoint;

    /**
     * 总积分
     */
    private BigDecimal totalPoint;

    /**
     * 总计已使用积分
     */
    private BigDecimal totalUsePoint;
}
