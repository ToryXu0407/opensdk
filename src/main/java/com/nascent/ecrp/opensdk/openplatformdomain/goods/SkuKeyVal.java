package com.nascent.ecrp.opensdk.openplatformdomain.goods;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Lijian
 * 2018/11/29
 * sku列表
 * 所在接口：查询单个商品详情
 */
@Setter
@Getter
public class SkuKeyVal {

    /**
     *sku编码
     */
    private String skuId;

    /**
     *sku属性
     */
    private String skuPropertiesName;

}
