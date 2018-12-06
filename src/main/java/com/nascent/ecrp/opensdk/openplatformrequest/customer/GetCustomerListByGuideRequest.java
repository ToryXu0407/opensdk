package com.nascent.ecrp.opensdk.openplatformrequest.customer;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.GetCustomerListByGuideResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:59
 * 会员信息列表接口
 */
@Getter
@Setter
public class GetCustomerListByGuideRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetCustomerListByGuideResponse> {

    /**
     * 用户编号s，用逗号隔开
     */
    private String customerIds;

    /**
     * 导购编号（Long）
     */
    private Long guideId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 用户昵称
     */
    private String nickName	;

    /**
     *页码（Integer）
     */
    private Integer pageNo;

    /**
     * 页面大小（Integer）
     */
    private Integer pageSize;

    /**
     * 注册时间（结束）
     */
    private String registerTimeEnd;

    /**
     * 注册时间(开始)
     */
    private String registerTimeStart;

    /**
     * 查询值，当这个值不为空时，会用这个值覆盖mobile和name值
     */
    private String searchValue;

    /**
     * 性别（Integer）
     */
    private Integer sex;

    /**
     * 导购店铺编号（Long）
     */
    private Long sgShopId;

    /**
     * 店铺编号（Long）
     */
    private Long shopId;

    public String GetApiName() {
        return "/openApi/guideCustomer/getCustomerListByGuide";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCustomerListByGuideResponse> getResponseClass() {
        return GetCustomerListByGuideResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("customerIds",this.getCustomerIds());
        params.put("guideId",this.getGuideId());
        params.put("mobile",this.getMobile());
        params.put("name",this.getName());
        params.put("nickName",this.getNickName());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("registerTimeEnd",this.getRegisterTimeEnd());
        params.put("registerTimeStart",this.getRegisterTimeStart());
        params.put("searchValue",this.getSearchValue());
        params.put("sex",this.getSex());
        params.put("sgShopId",this.getSgShopId());
        params.put("shopId",this.getShopId());
        return params;
    }



}
