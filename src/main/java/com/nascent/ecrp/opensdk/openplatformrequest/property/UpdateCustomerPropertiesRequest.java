package com.nascent.ecrp.opensdk.openplatformrequest.property;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.property.UpdateCustomerPropertiesResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:11:43
 * 更新会员属性接口
 */
@Setter
@Getter
public class UpdateCustomerPropertiesRequest extends OpenPlatformBaseRequest
        implements BaseRequest<UpdateCustomerPropertiesResponse> {

    /**
     * 客户ID（Long）
     */
    private Long customerId;

    /**
     * 视角编号（Long）
     */
    private Long brandId;

    /**
     * 属性集
     */
    private String tagList;

    public String GetApiName() {
        return "/openApi/property/updateCustomerProperties";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<UpdateCustomerPropertiesResponse> getResponseClass() {
        return UpdateCustomerPropertiesResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("customerId",this.getCustomerId());
        params.put("brandId",this.getBrandId());
        params.put("tagList",this.getTagList());
        return params;
    }
}
