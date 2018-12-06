package com.nascent.ecrp.opensdk.openplatformdomain.goods;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * * Created by Lijian on 2018/11/28.
 * 商品sku属性
 * 所在接口：新增/更新单个商品
 */
@Setter
@Getter
public class OpenSku {

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 属性
     */
    private String properties;

    /**
     * 属性名称
     */
    private String propertiesName;

    /**
     * 质量
     */
    private BigDecimal quantity;

    /**
     * skuId
     */
    private String skuId;


}
