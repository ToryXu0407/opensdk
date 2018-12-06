package com.nascent.ecrp.opensdk.openplatformrequest.point;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.point.SendIntegralResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:16:13
 * 积分赠送接口
 */
@Getter
@Setter
public class SendIntegralRequest extends OpenPlatformBaseRequest implements BaseRequest<SendIntegralResponse> {

    /**
     * 业务ID
     */
    private Integer businessID;

    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 业务类型，0:未知,1：调查,2：肌肤,3：签到,4：聚优惠,5：红包,6：优惠券,7：投票,8：宝
     */
    private Integer businessType;

    /**
     * ECRP客户ID
     */
    private Long customerId;

    /**
     * 积分过期时间
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
     * 备注
     */
    private String remark;

    /**
     * 发放类型 0 预发积分 1 直接发放积分
     */
    private Integer sendType;


    public String GetApiName() {
        return "/openApi/integral/sendIntegral";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<SendIntegralResponse> getResponseClass() {
        return SendIntegralResponse.class;
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
        params.put("remark",this.getRemark());
        params.put("sendType",this.getSendType());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }

}
