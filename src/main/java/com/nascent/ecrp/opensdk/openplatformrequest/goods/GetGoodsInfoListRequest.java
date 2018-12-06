package com.nascent.ecrp.opensdk.openplatformrequest.goods;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.goods.GetGoodsInfoListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询商品数据列表请求
 * Created by Lijian on 2018/11/28.
 */
@Getter
@Setter
public class GetGoodsInfoListRequest extends OpenPlatformBaseRequest implements BaseRequest<GetGoodsInfoListResponse> {

    /**
     * 商家编码
     */
    private String outerId;

    /**
     * 商品名称
     */
    private String title;


    /**
     * 店铺Id
     */
    private Long shopId;

    /**
     * 页码
     */
    private Integer pageNo = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    public String GetApiName() {
        return "/openApi/goodsQuery/getGoodsInfoList";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<GetGoodsInfoListResponse> getResponseClass() {
        return GetGoodsInfoListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("outerId",this.getOuterId());
        params.put("title",this.getTitle());
        params.put("shopId",this.getShopId());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }



}
