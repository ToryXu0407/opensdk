package com.nascent.ecrp.opensdk.openplatformresponse.goods;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.SkuKeyVal;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * 查询单个商品详情响应
 * * Created by Lijian on 2018/11/28.
 */
@Setter
@Getter
public class FindGoodsInfoResponse extends BaseResponse {

    /**
     * 30天内总销量
     */
    private BigDecimal thirtySalesCount;

    /**
     *商品标题
     */
    private String title;

    /**
     *商品类型
     */
    private String type;

    /**
     *品牌名称
     */
    private String brandName;

    /**
     *外部商家编码
     */
    private String outerId;

    /**
     *总销量
     */
    private String salesCount;

    /**
     *图片URL
     */
    private String pictureUrl;

    /**
     *sku列表
     */
    private List<SkuKeyVal> skuKeyValList;

}
