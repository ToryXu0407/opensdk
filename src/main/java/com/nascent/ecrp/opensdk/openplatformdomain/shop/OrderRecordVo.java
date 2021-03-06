package com.nascent.ecrp.opensdk.openplatformdomain.shop;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Lijian
 * 2018/11/29
 * 订单记录
 */
@Getter
@Setter
public class OrderRecordVo {

    private Long id;

    private Integer state;

    private Date createTime;

    private Date updateTime;

    private Long groupId;

    private String shopName;

    private String  appKey;

    private String appSecret;

    private String accessToken;

    private Date expiresIn;

    private String refreshToken;

    private Date reExpiresIn;

    private String jlSessionKey;

    private Date jlkeyExpireTime;

    private String kdSessionKey;

    private Integer platform;

    private Integer shopStatus;

    private String shopType;

    private Integer isOnline;

    private String country;

    private String province;

    private String city;

    private String district;

    private String zip;

    private String address;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String areaRegion;

    private Integer isSyn;

    private String shopGuid;

    private String outSid;

    private String outUid;

    private Integer isSaas;

    private String serviceIP;

    private Integer post;

    private String userId;

    private String userPwd;

    private String runServerIp;

    private Integer calGradeType;

    private Date openShopTime;

    private String businessTimeSpan;

    private String contactJson;

    private String guid;

    private String remark;

    private Long shopViewIds;

    private String saasPushUrl;

    private String outId;

    private String cateIds;

    private String key;

}
