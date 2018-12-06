package com.nascent.ecrp.opensdk.openplatformresponse.trade;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:15:26
 * 批量保存订单
 */
@Setter
@Getter
public class TradeSaveListResponse extends BaseResponse {

    private List<Map<String,Object>> result;

}
