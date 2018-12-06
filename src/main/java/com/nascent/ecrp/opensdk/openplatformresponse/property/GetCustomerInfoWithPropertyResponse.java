package com.nascent.ecrp.opensdk.openplatformresponse.property;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.property.PropertyInfo;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:19:11
 * 单个会员信息（包括属性、rfm值）详情接口
 */
@Getter
@Setter
public class GetCustomerInfoWithPropertyResponse extends BaseResponse {

    /**
     * 地址
     */
    private String address;

    /**
     * 会员宝贝生日
     */
    private String babyBirthday;

    /**
     * 会员宝贝名称
     */
    private String babyName;

    /**
     * 会员宝贝性别 -1未知，0：女，1：男
     */
    private Integer babySex;

    /**
     * 生日（格式：yyyy-MM-dd）
     */
    private String birthday;

    /**
     * 回购周期(BigDecimal)
     */
    private BigDecimal buyBackAllPeriod;

    /**
     * 市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 会员编号（Long）
     */
    private Long customerId;

    /**
     * 会员名称
     */
    private String customerName;

    /**
     * 区
     */
    private String district;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 等级（Integer）
     */
    private Integer grade;

    /**
     * 头像链接
     */
    private String image;

    /**
     * 客件数(BigDecimal)
     */
    private BigDecimal itemUnit;

    /**
     * 职业
     */
    private String job;

    /**
     * 最后成功交易时间(Date)
     */
    private Date lastSuccessTime;

    /**
     * 结婚状态（0：未知，1:未婚，2：已婚）
     */
    private Integer marryStatus;

    /**
     * 会员卡号
     */
    private String memberCard;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 平台客户昵称(对标保存、更新时传入的outNick)
     */
    private String outAlias;

    /**
     * 积分
     */
    private BigDecimal point;

    /**
     * 客单价(BigDecimal)
     */
    private BigDecimal priceUnit;

    /**
     * 省份
     */
    private String province;

    /**
     * qq号码
     */
    private String qq;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 属性列表
     */
    private List<PropertyInfo> propertyInfos;

    /**
     * 成功交易总额,（一天多笔算多笔(BigDecimal)
     */
    private BigDecimal tradeAmount;

    /**
     * 成功交易次数,（一天多笔算多笔）(Integer)
     */
    private BigDecimal tradeTimes;

    /**
     * 更新时间
     */
    private String updateTime;

}
