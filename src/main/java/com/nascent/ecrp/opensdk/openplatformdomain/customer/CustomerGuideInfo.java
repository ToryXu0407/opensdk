package com.nascent.ecrp.opensdk.openplatformdomain.customer;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:03
 * 会员信息
 * 所在接口：会员信息列表接口
 */
@Setter
@Getter
public class CustomerGuideInfo {
    /**
     * 会员编号（Long）
     */
    private Long customerId;

    /**
     * 会员等级
     */
    private String grade;

    /**
     * 导购编号（Long）
     */
    private Long guideId;

    /**
     * 头像图片地址
     */
    private String image;

    /**
     * 会员卡号
     */
    private String memberCard;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 会员名称
     */
    private String name;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 注册时间
     */
    private String registerTime;

    /**
     * 性别（int）
     */
    private Integer sex;

    /**
     * 有效标签集
     */
    private List<TagNameInfo> tagNameList;

}
