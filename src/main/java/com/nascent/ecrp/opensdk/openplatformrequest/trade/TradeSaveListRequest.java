package com.nascent.ecrp.opensdk.openplatformrequest.trade;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformdomain.trade.TradeInfo;
import com.nascent.ecrp.opensdk.openplatformresponse.trade.TradeSaveListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:15:27
 * 批量保存订单
 */
@Setter
@Getter
public class TradeSaveListRequest extends OpenPlatformBaseRequest implements BaseRequest<TradeSaveListResponse> {

    /**
     * 订单列表
     */
    private List<TradeInfo> tradeInfos;

    public String GetApiName() {
        return "/openApi/tradeInsert/tradeSaveList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<TradeSaveListResponse> getResponseClass() {
        return TradeSaveListResponse.class;
    }

    public Map<String, Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("tradeInfos",this.getTradeInfos());
        params.put("groupId",this.getGroupId());
        params.put("brandId",this.getBrandId());
        return params;
    }

}
