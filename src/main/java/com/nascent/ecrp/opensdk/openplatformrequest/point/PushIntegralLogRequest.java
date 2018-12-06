package com.nascent.ecrp.opensdk.openplatformrequest.point;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.point.PushIntegralLogResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:19
 * 推送积分日志接口
 */
@Setter
@Getter
public class PushIntegralLogRequest extends OpenPlatformBaseRequest implements BaseRequest<PushIntegralLogResponse> {
    public String GetApiName() {
        return "/openApi/integral/pushIntegralLog";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<PushIntegralLogResponse> getResponseClass() {
        return PushIntegralLogResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("businessType",this.getBusinessType());
        params.put("customerId",this.getCustomerId());
        params.put("extendJson",this.getExtendJson());
        params.put("log",this.getLog());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("providerGUID",this.getProviderGUID());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }

    /**
     * 业务类型，0:未知,1：调查,2：肌肤,3：签到,4：聚优惠,5：红包,6：优惠券,7：投票,8：宝
     */
    private Integer businessType;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 扩展条件：{name:value} ClientType：客户端类型，0:未知,1:PC端 2:移动
     */
    private String extendJson;

    /**
     * 日志内容
     */
    private String log;

    /**
     * 用户昵称（淘宝昵称/微博ID/微信ID/扩展ID）
     */
    private String nick;

    /**
     * 昵称类型：1：真实昵称 2：模糊昵称 3：手机号唯一标识 4：手机号码 5：微信ID 6：第三方ID
     */
    private Integer nickType;

    /**
     * 提供者标识（即shopguid）
     */
    private String providerGUID;

}
