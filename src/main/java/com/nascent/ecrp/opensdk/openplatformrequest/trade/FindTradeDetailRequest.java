package com.nascent.ecrp.opensdk.openplatformrequest.trade;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.trade.FindTradeDetailResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:15:23
 * 查询交易详情
 */
@Setter
@Getter
public class FindTradeDetailRequest extends OpenPlatformBaseRequest
        implements BaseRequest<FindTradeDetailResponse> {

    /**
     *外部订单编号
     */
    private Long outTradeId;

    /**
     *订单来源
     */
    private Long platform;

    public String GetApiName() {
        return "/openApi/tradeSelect/findTradeDetail";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<FindTradeDetailResponse> getResponseClass() {
        return FindTradeDetailResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("outTradeId",this.getOutTradeId());
        params.put("platform",this.getPlatform());
        params.put("groupId",this.getGroupId());
        params.put("brandId",this.getBrandId());
        return params;
    }

}
