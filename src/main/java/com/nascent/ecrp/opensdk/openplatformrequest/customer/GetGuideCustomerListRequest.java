package com.nascent.ecrp.opensdk.openplatformrequest.customer;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.GetGuideCustomerListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:33
 * 获取专属导购id不为空的会员列表
 */
@Getter
@Setter
public class GetGuideCustomerListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetGuideCustomerListResponse> {

    /**
     * 会员注册时间(查询结束时间)(Date)(必填)
     */
    private String endTime;

    /**
     * 页码(Integer)
     * 	默认1
     */
    private Integer pageNo=1;

    /**
     * 页面大小(Integer)
     * 	默认10
     */
    private Integer pageSize=10;

    /**
     * 门店ID(Long)
     */
    private Long shopId;

    /**
     * 会员注册时间(查询开始时间)(Date)
     */
    private Date startTime;

    public String GetApiName() {
        return "/openApi/guideCustomer/getGuideCustomerList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetGuideCustomerListResponse> getResponseClass() {
        return GetGuideCustomerListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("endTime",this.getEndTime());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("shopId",this.getShopId());
        params.put("startTime",this.getStartTime());
        return params;
    }



}
