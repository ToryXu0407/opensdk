package com.nascent.ecrp.opensdk.openplatformdomain.point;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:06
 * 日志信息
 */
@Getter
@Setter
public class LogListInfo {

    /**
     * 积分平台账号
     */
    private String accountCode;

    /**
     * 业务ID
     */
    private String businessID;

    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 业务类型
     */
    private Integer businessType;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 积分平台会员ID
     */
    private Long customerID;

    /**
     * 积分过期时间
     */
    private String expiredTime;

    /**
     * 扩展字段
     */
    private String extendJson;

    /**
     * 日志guid
     */
    private String guid;

    /**
     * 积分ID
     */
    private Long id;

    /**
     * 平台唯一标识码
     */
    private String nick;

    /**
     * 标识码列表
     */
    private List<NickListInfo> nickListInfos;

    /**
     * 平台类型
     */
    private Integer nickType;

    /**
     * 提供者Guid
     */
    private String providerGuid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 积分值
     */
    private Long total;

    /**
     * 改变类型 1 赠送 3 扣减 5 积分日志 7 活动日志
     */
    private Integer type;

}
