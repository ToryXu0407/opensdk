package com.nascent.ecrp.opensdk.openplatformrequest.customer;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.GetMemberGradeResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/28
 * Time:19:05
 * 查询会员等级规则
 */
@Getter
@Setter
public class GetMemberGradeRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetMemberGradeResponse> {

    /**
     * 1:以权益为主体,0:以等级为主体（不填默认为0）
     */
    private Integer resultType;

    public String GetApiName() {
        return "/openApi/customer/getMemberGrade";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetMemberGradeResponse> getResponseClass() {
        return GetMemberGradeResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("resultType",this.getResultType());
        return params;
    }




}
