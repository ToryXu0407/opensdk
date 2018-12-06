package com.nascent.ecrp.opensdk.openplatformrequest.point;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.point.ReduceIntegralResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:16:06
 * 积分扣减接口
 */
@Getter
@Setter
public class ReduceIntegralRequest extends OpenPlatformBaseRequest implements BaseRequest<ReduceIntegralResponse> {

    /**
     * 业务ID
     */
    private String businessID;

    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 积分来源具体类型：互动：0:未知 1：调查,2：肌肤,3：签到,4：聚优惠,5：红包,6：优惠券,7
     */
    private Integer businessType;

    /**
     * ECRP客户ID
     */
    private Long customerId;

    /**
     * 预扣过期时间
     */
    private String expiredTime;

    /**
     * 扩展信息
     */
    private String extendJson;

    /**
     * 平台唯一标识码
     */
    private String nick;

    /**
     * 平台唯一标识码类型
     */
    private Integer nickType;

    /**
     * 积分值
     */
    private BigDecimal point;

    /**
     * 提供者标识
     */
    private String providerGUID;

    /**
     * 扣减类型：2 预扣积分 3 扣减积分
     */
    private Integer reduType;

    /**
     * 备注
     */
    private String remark;


    public String GetApiName() {
        return "/openApi/integral/reduceIntegral";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<ReduceIntegralResponse> getResponseClass() {
        return ReduceIntegralResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("businessID",this.getBusinessID());
        params.put("businessName",this.getBusinessName());
        params.put("businessType",this.getBusinessType());
        params.put("customerId",this.getCustomerId());
        params.put("expiredTime",this.getExpiredTime());
        params.put("extendJson",this.getExtendJson());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("point",this.getPoint());
        params.put("providerGUID",this.getProviderGUID());
        params.put("reduType",this.getReduType());
        params.put("remark",this.getRemark());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }
}
