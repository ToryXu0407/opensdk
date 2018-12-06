package com.nascent.ecrp.opensdk.openplatformrequest.customer;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.FindCustomerResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:16
 * 会员查询接口单个
 */
@Getter
@Setter
public class FindCustomerRequest extends OpenPlatformBaseRequest
        implements BaseRequest<FindCustomerResponse> {

    /**
     * ECRP客户ID,如果有传客户ID则其它条件无效
     */
    private Long customerId;


    /**
     * 客户码标识
     */
    private String nick;

    /**
     * 客户码标识类型：
     */
    private Integer nickType;

    public String GetApiName() {
        return "/openApi/customer/findCustomer";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<FindCustomerResponse> getResponseClass() {
        return FindCustomerResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("customerId",this.getCustomerId());
        return params;
    }


}
