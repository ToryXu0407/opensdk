package com.nascent.ecrp.opensdk.openplatformrequest.customer;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.GetCustomerRFMResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:45
 * 查询会员rfm信息
 */
@Getter
@Setter
public class GetCustomerRFMRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetCustomerRFMResponse> {

    /**
     * 系统会员Id(Long)
     */
    private Long sysCustomerId;

    public String GetApiName() {
        return "/openApi/guideCustomer/getCustomerRFM";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCustomerRFMResponse> getResponseClass() {
        return GetCustomerRFMResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("sysCustomerId",this.getSysCustomerId());
        return params;
    }



}
