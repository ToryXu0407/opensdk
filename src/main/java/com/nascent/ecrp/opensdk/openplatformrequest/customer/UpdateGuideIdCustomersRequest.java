package com.nascent.ecrp.opensdk.openplatformrequest.customer;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.UpdateGuideIdCustomersResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:40
 * 更换会员导购接口（批量更改）
 */
@Getter
@Setter
public class UpdateGuideIdCustomersRequest extends OpenPlatformBaseRequest
        implements BaseRequest<UpdateGuideIdCustomersResponse> {

    /**
     * 会员ID，逗号分隔
     */
    private String customerIds;

    /**
     * 导购ID(Long)
     */
    private Long guideId;

    /**
     * 导购ID(Long)(作为查询条件筛选会员)
     */
    private Long oldGuideId;

    /**
     * 专属导购门店Id(Long)
     */
    private Long sgShopId;

    public String GetApiName() {
        return "/openApi/guideCustomer/updateGuideIdCustomers";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<UpdateGuideIdCustomersResponse> getResponseClass() {
        return UpdateGuideIdCustomersResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("customerIds",this.getCustomerIds());
        params.put("guideId",this.getGuideId());
        params.put("oldGuideId",this.getOldGuideId());
        params.put("sgShopId",this.getSgShopId());
        return params;
    }



}
