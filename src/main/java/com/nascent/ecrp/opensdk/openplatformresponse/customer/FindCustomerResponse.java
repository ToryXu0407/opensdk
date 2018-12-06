package com.nascent.ecrp.opensdk.openplatformresponse.customer;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:11
 * 会员查询接口单个
 */
@Getter
@Setter
public class FindCustomerResponse extends BaseResponse {

    /**
     * 详细地址
     */
    private String address;

    /**
     * 宝宝生日
     */
    private String babyBirthday;

    /**
     * 宝宝姓名
     */
    private String babyName;

    /**
     * 宝宝性别 -1未知，0：女，1：男
     */
    private Integer babySex;

    /**
     * 绑定时间
     */
    private String bindTime;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 来源平台
     */
    private String businessMark;

    /**
     * 支付宝账号
     */
    private String buyerAlipayNo;

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
     * ECRP客户ID
     */
    private Long customerId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 区
     */
    private String district;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 会员等级
     */
    private Integer grade;

    /**
     * 职业
     */
    private String job;

    /**
     * 结婚状态（0：未知，1:未婚，2：已婚）
     */
    private Integer marryStatus;

    /**
     * 客户手机号
     */
    private String mobile;

    /**
     * 平台客户昵称(对标保存、更新时传入的outNick)
     */
    private String outAlias;

    /**
     * 可用积分
     */
    private BigDecimal point;

    /**
     * 省
     */
    private String province;

    /**
     * QQ号
     */
    private String qq;

    /**
     * 性别 -1未知，0：女，1：男
     */
    private Integer sex;

    /**
     * 固定电话
     */
    private String telPhone;

    /**
     * 修改时间
     */
    private String updateTime;


}
