package com.nascent.ecrp.opensdk.openplatformrequest.goods;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.goods.GetGoodsInfoListForUserCenterResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * 查询商品列表（互动专用）请求
 * Created by Lijian on 2018/11/28.
 */
@Setter
@Getter
public class GetGoodsInfoListForUserCenterRequest extends OpenPlatformBaseRequest implements BaseRequest<GetGoodsInfoListForUserCenterResponse> {

    /**
     * 平台
     */
    private Integer platform;


    /**
     * 页码
     */
    private Integer pageNo = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    /**
     * 店铺Id
     */
    private Long shopId;

    /**
     * 	商品标题
     */
    private String title;

    public String GetApiName() {
        return "/openApi/goodsQuery/getGoodsInfoListForUserCenter";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<GetGoodsInfoListForUserCenterResponse> getResponseClass() {
        return GetGoodsInfoListForUserCenterResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("platform",this.getPlatform());
        params.put("pageNo",this.getPageNo());
        params.put("pageSize",this.getPageSize());
        params.put("shopId",this.getShopId());
        params.put("title",this.getTitle());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }


}
