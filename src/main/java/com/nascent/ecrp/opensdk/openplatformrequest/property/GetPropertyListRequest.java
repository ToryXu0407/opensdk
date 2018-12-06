package com.nascent.ecrp.opensdk.openplatformrequest.property;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.property.GetPropertyListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:12:00
 * 获取自定义属性
 */
@Getter
@Setter
public class GetPropertyListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetPropertyListResponse> {

    /**
     * 客户ID（Long）
     */
    private Long customerId;

    /**
     * 视角编号（Long）
     */
    private Long brandId;

    public String GetApiName() {
        return "/openApi/property/getPropertyList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetPropertyListResponse> getResponseClass() {
        return GetPropertyListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("customerId",this.getCustomerId());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }
}
