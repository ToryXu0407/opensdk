package com.nascent.ecrp.opensdk.openplatformrequest.subdivision;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.subdivision.ExitsSubdivisionResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 查看用户时候存在分组中请求
 * Created by Lijian on 2018/11/29.
 */
@Getter
@Setter
public class ExitsSubdivisionRequest extends OpenPlatformBaseRequest implements BaseRequest<ExitsSubdivisionResponse> {

    /**
     * 平台唯一标识码
     */
    private String nick;

    /**
     * 平台唯一标识码类型
     */
    private Integer nickType;

    /**
     * ECRP客户ID
     */
    private Long customerId;

    /**
     * 分组id(用逗号分开)
     */
    private String subdivisionId;

    public String GetApiName() {
        return "/openApi/SubdivisionSelect/exitsSubdivision";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<ExitsSubdivisionResponse> getResponseClass() {
        return ExitsSubdivisionResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("customerId",this.getCustomerId());
        params.put("subdivisionId",this.getSubdivisionId());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }
}
