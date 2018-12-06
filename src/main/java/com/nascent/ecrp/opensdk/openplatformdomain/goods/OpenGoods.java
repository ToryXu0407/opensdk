package com.nascent.ecrp.opensdk.openplatformdomain.goods;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Lijian
 * 2018/11/29
 * 商品信息
 * 所在接口：批量新增/更新商品数据
 */
@Getter
@Setter
public class OpenGoods {

    /**
     * 系统生成商品ID
     */
    private String outItemId;

    /**
     * 商家编码
     */
    private String outerId;

    /**
     * 货号
     */
    private String artNo;

    /**
     * 商品所属的叶子类目 id 淘宝大类目
     */
    private Long classId;

    /**
     * 成本价（BigDecimal）
     */
    private BigDecimal costPrice;

    /**
     * 下架时间（datatime）
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inventoryTime;

    /**
     * 是否支持会员打折
     */
    private Integer isHasDiscount;

    /**
     * 虚拟商品的状态字段
     */
    private Integer isVirtual;

    /**
     * 商品周期，单位：天
     */
    private Integer itemCycle;

    /**
     * 商品过期时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date itemExpired;

    /**
     * 商品链接短地址
     */
    private String itemShortUrl;

    /**
     * 商品链接短地址过期时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date itemShortUrlExpired;

    /**
     * 商品状态
     */
    private Integer itemState;

    /**
     * 商品Url
     */
    private String itemUrl;

    /**
     * 商品类型
     */
    private String itemType;

    /**
     * 商品数量
     */
    private BigDecimal number;

    /**
     * 上架时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date onsaleTime;

    /**
     * 图片URL
     */
    private String pictureUrl;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     *	关联商品ID字符串
     */
    private String relateItemIds;

    /**
     * 备注
     */
    private String remark;

    /**
     * 自定义类目列表，商品所属的店铺内卖家自定义类目列表
     */
    private String sellerCids;

    /**
     * 标签ID字符串
     */
    private String tagIds;

    /**
     * 标题
     */
    private String title;

    /**
     * 	有效期
     */
    private Integer validthru;

    /**
     * 重量
     */
    private BigDecimal weight;

    /**
     * 平台编号
     */
    private Integer platform;

    /**
     * 商品ID
     */
    private Long Id;

    /**
     * 商品销售数量
     */
    private BigDecimal salesCount;

    /**
     * 外部店铺Id
     */
    private String outSid;

    /**
     * sku列表
     */
    private List<OpenSku> skus;

}
