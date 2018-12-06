package com.nascent.ecrp.opensdk.openplatformrequest.point;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.point.GetCustomerPointInfoResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:24
 * 查询积分接口
 */
@Setter
@Getter
public class GetCustomerPointInfoRequest extends OpenPlatformBaseRequest implements BaseRequest<GetCustomerPointInfoResponse> {

    /**
     * 客户ID（Long）
     */
    private Long customerId;

    /**
     * 客户昵称与昵称类型联合查询,如果有传客户昵称则其它条件无效
     */
    private String nick;

    /**
     * 客户昵称与昵称类型联合查询,如果有传客户昵称则其它条件无效（int）
     */
    private Integer nickType;

    public String GetApiName() {
        return "/openApi/integral/getCustomerPointInfo";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetCustomerPointInfoResponse> getResponseClass() {
        return GetCustomerPointInfoResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("customerId",this.getCustomerId());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }
}
