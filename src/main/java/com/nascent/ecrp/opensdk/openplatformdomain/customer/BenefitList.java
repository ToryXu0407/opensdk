package com.nascent.ecrp.opensdk.openplatformdomain.customer;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:19:02
 * 积分折扣列表
 * 所在接口：查询会员等级规则
 */
@Setter
@Getter
public class BenefitList {

    /**
     * 1:积分, 2折扣
     */
    private Integer benefitType;

    /**
     * 倍:送几倍积分, 多:多送多少积分.为折扣类型时此字段为空
     */
    private String extendInfo;

    /**
     * 具体的折扣或者倍数,积分值
     */
    private String value;

}
