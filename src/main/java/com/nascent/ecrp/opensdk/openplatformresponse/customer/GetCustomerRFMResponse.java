package com.nascent.ecrp.opensdk.openplatformresponse.customer;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:43
 * 查询会员rfm信息
 */
@Getter
@Setter
public class GetCustomerRFMResponse extends BaseResponse {

    /**
     * 回购周期(BigDecimal)
     */
    private BigDecimal buyBackAllPeriod;

    /**
     * 客件数(BigDecimal)
     */

    private BigDecimal itemUnit;

    /**
     * 最后成功交易时间(Date)
     */
    private Date lastSuccessTime;

    /**
     * 客单价(BigDecimal)
     */
    private BigDecimal priceUnit;

    /**
     * 成功交易总额,（一天多笔算多笔(BigDecimal)
     */
    private BigDecimal tradeAmount;

    /**
     * 成功交易次数,（一天多笔算多笔）(Integer)
     */
    private Integer tradeTimes;


}
