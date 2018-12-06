package com.nascent.ecrp.opensdk.openplatformdomain.subdivision;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Lijian
 * 2018/11/29
 * 品牌分组信息
 */
@Getter
@Setter
public class BrandSubdivisionInfo {

    /**
     * 品牌Id
     */
    private Long brandId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 分组条件数量
     */
    private Integer filterCount;

    /**
     * 集团ID
     */
    private Long groupId;

    /**
     * 分组Id
     */
    private String id;

    /**
     * 是否是分类：1 是 0 否
     */
    private String isCategory;

    /**
     * 登录帐号
     */
    private String loginAccount;

    /**
     * 营销使用次数
     */
    private Integer marketingCount;

    /**
     * 父类ID，默认：0表示没有爸爸
     */
    private Long parentId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 店铺Id
     */
    private Long shopId;

    /**
     * 分组名称
     */
    private String subdivisionName;

    /**
     * 部门ID
     */
    private Long sysDepartmentId;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 人数
     */
    private Integer userCount;

    /**
     * 用户姓名
     */
    private String userName;


}
