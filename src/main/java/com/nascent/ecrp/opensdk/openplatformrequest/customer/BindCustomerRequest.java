package com.nascent.ecrp.opensdk.openplatformrequest.customer;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.BindCustomerResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:19
 * 会员绑定/解绑接口
 */
@Getter
@Setter
public class BindCustomerRequest extends OpenPlatformBaseRequest
        implements BaseRequest<BindCustomerResponse> {
    /**
     * 操作类型：0绑定 1解绑
     */
    private Integer bindType;

    /**
     *手机号
     */
    private String mobile;

    /**
     * 客户唯一标识码
     */
    private String nick;

    /**
     * 平台唯一标示码类型
     */
    private Integer nickType;

    public String GetApiName() {
        return "/openApi/customer/bindCustomer";
    }

    @Override
    public String getMethodType() {
        return "POST";
    }

    @Override
    public Class<BindCustomerResponse> getResponseClass() {
        return BindCustomerResponse.class;
    }

    @Override
    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("bindType",this.getBindType());
        params.put("mobile",this.getMobile());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        return params;
    }



}
