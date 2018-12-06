package com.nascent.ecrp.opensdk.openplatformrequest.property;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.property.GetCustomerInfoWithPropertyResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:11:41
 * 单个会员信息（包括属性、rfm值）详情接口
 */
@Setter
@Getter
public class GetCustomerInfoWithPropertyRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetCustomerInfoWithPropertyResponse> {

    /**
     * 客户ID（Long）
     */
    private Long customerId;

    /**
     * 视角编号（Long）
     */
    private Long brandId;

    public String GetApiName() {
        return "/openApi/property/getCustomerInfoWithProperty";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCustomerInfoWithPropertyResponse> getResponseClass() {
        return GetCustomerInfoWithPropertyResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("customerId",this.getCustomerId());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }

}
