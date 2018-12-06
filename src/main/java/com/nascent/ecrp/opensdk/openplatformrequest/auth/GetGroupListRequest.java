package com.nascent.ecrp.opensdk.openplatformrequest.auth;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.auth.GetGroupListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:9:45
 * 查询集团列表接口
 */
@Getter
@Setter
public class GetGroupListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetGroupListResponse> {
    public String GetApiName() {
        return "/openApi/auth/getGroupList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetGroupListResponse> getResponseClass() {
        return GetGroupListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
       return params;
    }
}
