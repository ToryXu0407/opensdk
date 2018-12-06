package com.nascent.ecrp.opensdk.openplatformrequest.trade;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.trade.GetFinishTradeListResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:15:37
 * 根据订单状态查询订单列表
 */
@Setter
@Getter
public class GetFinishTradeListRequest extends OpenPlatformBaseRequest
        implements BaseRequest<GetFinishTradeListResponse> {

    /**
     *订单完成时间结束时间(Date)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String finishTimeEnd;

    /**
     *订单完成时间开始时间(Date)(必填)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String finishTimeStart;

    /**
     *页码(Integer)
     */
    private Integer pageNo = 1;

    /**
     *页面大小(Integer)
     */
    private Integer pageSize = 10;

    /**
     *店铺Id(Long)
     */
    private Long shopId;

    /**
     *订单状态
     */
    private String tradeStatus;

    public String GetApiName() {
        return "/openApi/GuideTradeSelect/getFinishTradeList";
    }

    public String getMethodType() {
        return "POST";
    }

    public Class<GetFinishTradeListResponse> getResponseClass() {
        return GetFinishTradeListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String, Object> params= new HashMap<>();
        params.put("finishTimeEnd",this.getFinishTimeEnd());
        params.put("finishTimeStart",this.getFinishTimeStart());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("shopId",this.getShopId());
        params.put("tradeStatus",this.getTradeStatus());
        params.put("groupId",this.getGroupId());
        params.put("brandId",this.getBrandId());
        return params;
    }

}
