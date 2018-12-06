package com.nascent.ecrp.opensdk.openplatformrequest.point;
import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.point.GetIntegralLoglistResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:18:12
 * 积分查询日志接口
 */
@Getter
@Setter
public class GetIntegralLogListRequest extends OpenPlatformBaseRequest implements BaseRequest<GetIntegralLoglistResponse> {

    /**
     * 业务类型，0:未知,1：调查,2：肌肤,3：签到,4：聚优惠,5：红包,6：优惠券,7：投票,8：宝
     */
    private Integer businessType;

    /**
     * ECRP客户ID
     */
    private Long customerId;

    /**
     * 查询结束时间
     */
    private String endTime;

    /**
     * 扩展条件：{name:value}
     */
    private String extendJson;

    /**
     * 平台唯一标识码
     */
    private String nick;

    /**
     * 平台类型
     */
    private Integer nickType;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页条数，默认10
     */
    private Integer pageSize;

    /**
     * 提供者标识
     */
    private String providerGUID;

    /**
     * 是否需要返回总数
     */
    private Boolean returnTotal;

    /**
     * 起始日志ID
     */
    private Long startID;

    /**
     * 查询起始时间
     */
    private String startTime;

    /**
     * 改变类型 1 赠送 3 扣减 5 积分日志 7 活动日志
     */
    private Integer type;


    public String GetApiName() {
        return "/openApi/integral/getIntegralLogList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetIntegralLoglistResponse> getResponseClass() {
        return GetIntegralLoglistResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("businessType",this.getBusinessType());
        params.put("customerId",this.getCustomerId());
        params.put("endTime",this.getEndTime());
        params.put("extendJson",this.getExtendJson());
        params.put("nick",this.getNick());
        params.put("nickType",this.getNickType());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("providerGUID",this.getProviderGUID());
        params.put("returnTotal",this.getReturnTotal());
        params.put("startID",this.getStartID());
        params.put("startTime",this.getStartTime());
        params.put("type",this.getType());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }
}
