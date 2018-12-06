package com.nascent.ecrp.opensdk.openplatformresponse.goods;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.ShopResultVo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 查询商品列表（互动专用）响应
 * * Created by Lijian on 2018/11/28.
 */
@Setter
@Getter
public class GetGoodsInfoListForUserCenterResponse extends BaseResponse {

    /**
     * 页码
     */
    private Integer pageNo = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    /**
     * 起始
     */
    private Integer pageStart;

    /**
     * 总记录数量
     */
    private Integer pageTotal;

    private List<ShopResultVo> shopResultVoList;

}
