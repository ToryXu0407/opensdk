package com.nascent.ecrp.opensdk.openplatformrequest.customer;
import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.SaveCustomerResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:13:32
 * 会员保存更新接口
 */
@Getter
@Setter
public class SaveCustomerRequest extends OpenPlatformBaseRequest
        implements BaseRequest<SaveCustomerResponse> {

    /**
     * 详细地址
     */
    private String address;

    /**
     * 支付宝账号
     */
    private String alipayNo;

    /**
     * 宝宝生日（格式：yyyy-MM-dd）
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
     * 生日（格式：yyyy-MM-dd）
     */
    private String birthday;

    /**
     * '客户业务来源（微信公众号、支付宝生活号等）',
     */
    private String businessMark;

    /**
     * 市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * ECRP客户ID，如果有传客户ID则其它条件无效
     */
    private Long customerId;

    /**
     * 客户真实姓名
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
     * 扩展JSON，用于存储扩展信息
     */
    private String extJson;

    /**
     * 客户等级
     */
    private Integer grade;

    /**
     * 客户头像
     */
    private String headImage;

    /**
     * 职业
     */
    private String job;

    /**
     * 结婚状态（0：未知，1:未婚，2：已婚）
     */
    private Integer marryStatus;

    /**
     * 平台客户唯一标示码
     */
    private String nick;

    /**
     * 平台类型 0：未知 1：淘宝
     */
    private Integer nickType;

    /**
     * 平台客户昵称
     */
    private String outAlias;

    /**
     * 平台子账号会员标示
     */
    private String platSubMemberMark;

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
     * 专属导购ID
     */
    private Integer sgGuideId;

    /**
     * 客户来源
     */
    private Integer sgRecruitState;

    /**
     * 专属导购门店
     */
    private Long sgShopId;

    /**
     * 固定电话
     */
    private String telphone;

    /**
     * 微信unionId
     */
    private String unionId;


    public String GetApiName() {
        return "/openApi/customer/saveCustomer";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<SaveCustomerResponse> getResponseClass() {
        return SaveCustomerResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("address",this.getAddress());
        params.put("babyBirthday",this.getBabyBirthday());
        params.put("babyName",this.getBabyName());
        params.put("babySex",this.getBabySex());
        params.put("birthday",this.getBirthday());
        params.put("businessMark",this.getBusinessMark());
        params.put("city",this.getCity());
        params.put("country",this.getCountry());
        params.put("customerId",this.getCustomerId());
        params.put("customerName",this.getCustomerName());
        params.put("district",this.getDistrict());
        params.put("email",this.getEmail());
        params.put("extJson",this.getExtJson());
        params.put("grade",this.getGrade());
        params.put("headImage",this.getHeadImage());
        params.put("job",this.getJob());
        params.put("marryStatus",this.getMarryStatus());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("outAlias",this.getOutAlias());
        params.put("platSubMemberMark",this.getPlatSubMemberMark());
        params.put("province",this.getProvince());
        params.put("qq",this.getQq());
        params.put("sex",this.getSex());
        params.put("sgGuideId",this.getSgGuideId());
        params.put("sgRecruitState",this.getSgRecruitState());
        params.put("sgShopId",this.getSgShopId());
        params.put("telphone",this.getTelphone());
        params.put("unionId",this.getUnionId());
        return params;
    }



}
