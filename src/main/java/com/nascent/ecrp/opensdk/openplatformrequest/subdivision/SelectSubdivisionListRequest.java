package com.nascent.ecrp.opensdk.openplatformrequest.subdivision;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.subdivision.SelectSubdivisionListResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取某品牌下的分组列表请求
 * Created by Lijian on 2018/11/29.
 */
public class SelectSubdivisionListRequest extends OpenPlatformBaseRequest implements BaseRequest<SelectSubdivisionListResponse> {

    public String GetApiName() {
        return "/openApi/SubdivisionSelect/selectSubdivisionList";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<SelectSubdivisionListResponse> getResponseClass() {
        return SelectSubdivisionListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        return new HashMap<>();
    }
}
