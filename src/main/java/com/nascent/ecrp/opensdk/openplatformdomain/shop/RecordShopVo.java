package com.nascent.ecrp.opensdk.openplatformdomain.shop;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Lijian
 * 2018/11/29
 * 店铺信息记录
 */
@Getter
@Setter
public class RecordShopVo {

    private Long viewId;

    private String viewName;

    private Integer viewType;

    private Boolean isMergeCustomer;

    private String remark;

    private String deployConfigJson;

    private Long groupId;

    private String integralAccount;

    private Integer memberScene;

    private Date createTime;

    private Date updateTime;

    private String emailAddress;

    private String sendEmailName;
}
