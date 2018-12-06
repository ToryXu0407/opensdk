package com.nascent.ecrp.opensdk.openplatformresponse.trade;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.trade.TradeDetail;
import com.nascent.ecrp.opensdk.openplatformdomain.trade.TradeDetailList;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:14:46
 * 查询交易详情
 */
@Setter
@Getter
public class FindTradeDetailResponse extends BaseResponse {

    /**
     * 订单详情
     */
    private TradeDetail tradeDetail;

    /**
     * 子订单列表
     */
    private List<TradeDetailList> tradeDetailListList;
}
