package com.nascent.ecrp.opensdk.openplatformdomain.goods;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Lijian
 * 2018/11/29
 * 商品信息
 * 所在接口：查询商品列表（互动专用）
 */
@Setter
@Getter
public class ShopResultVo {

    /**
     * 外部商品id
     */
    private String goodsId;

    /**
     * 商品标题
     */
    private String goodsName;

    /**
     * 图片URL
     */
    private String goodsPicUrl;

    /**
     * 商品链接
     */
    private String goodsUrl;

    /**
     * 内部商品id
     */
    private String id;

    /**
     * 商品平台
     */
    private Integer goodsPlatform;

    /**
     * 价格
     */
    private BigDecimal goodsPrice;
}
