package com.nascent.ecrp.opensdk.openplatformdomain.goods;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author Lijian
 * 2018/11/29
 * 商品信息
 * 所在接口：查询商品数据列表
 */
@Setter
@Getter
public class ShopInfomationVo {

    /**
     *商家编码
     */
    private String OuterId;

    /**
     *标题
     */
    private String title;

    /**
     * 图片URL
     */
    private String picUrl;

    /**
     * 销售量
     */
    private BigDecimal salesCount;

    /**
     * 30天内总销量
     */
    private BigDecimal thirtySalesCount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 价格
     */
    private BigDecimal price;

}
