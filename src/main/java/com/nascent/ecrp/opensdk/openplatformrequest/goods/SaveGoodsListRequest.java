package com.nascent.ecrp.opensdk.openplatformrequest.goods;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.OpenGoods;
import com.nascent.ecrp.opensdk.openplatformresponse.goods.SaveGoodsListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 批量新增/更新商品数据请求
 * Created by Lijian on 2018/11/29.
 */
@Setter
@Getter
public class SaveGoodsListRequest extends OpenPlatformBaseRequest implements BaseRequest<SaveGoodsListResponse> {

    /**
     * 商品列表
     */
    private List<OpenGoods> openGoodsList;

    public String GetApiName() {
        return "/openApi/goodQuery/saveGoodsList";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<SaveGoodsListResponse> getResponseClass() {
        return SaveGoodsListResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("openGoodsList",this.getOpenGoodsList());
        params.put("brandId",this.getBrandId());
        params.put("groupId",this.getGroupId());
        return params;
    }





}
