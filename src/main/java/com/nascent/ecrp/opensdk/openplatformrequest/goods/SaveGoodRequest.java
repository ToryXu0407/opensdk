package com.nascent.ecrp.opensdk.openplatformrequest.goods;

import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.Constants;
import com.nascent.ecrp.opensdk.openplatform.OpenPlatformBaseRequest;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.OpenSku;
import com.nascent.ecrp.opensdk.openplatformresponse.goods.SaveGoodResponse;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 新增/更新单个商品请求
 * Created by Lijian on 2018/11/28.
 */
@Setter
@Getter
public class SaveGoodRequest extends OpenPlatformBaseRequest implements BaseRequest<SaveGoodResponse> {

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
     * 店铺Id
     */
    private Long shopId;

    /**
     * sku列表
     */
    private List<OpenSku> skus;

    private String nonce;

    public String GetApiName() {
        return "/openApi/goodQuery/saveGood";
    }

    public String getMethodType() {
        return Constants.METHOD_POST;
    }

    public Class<SaveGoodResponse> getResponseClass() {
        return SaveGoodResponse.class;
    }

    public Map<String,Object> GetParameters() {
        Map<String,Object> params = new HashMap<>();
        params.put("outItemId",this.getOutItemId());
        params.put("outerId",this.getOuterId());
        params.put("artNo",this.getArtNo());
        params.put("classId",this.getClassId());
        params.put("costPrice",this.getCostPrice());
        params.put("inventoryTime",this.getInventoryTime());
        params.put("isHasDiscount",this.getIsHasDiscount());
        params.put("isVirtual",this.getIsVirtual());
        params.put("itemCycle",this.getItemCycle());
        params.put("itemExpired",this.getItemExpired());
        params.put("itemShortUrl",this.getItemShortUrl());
        params.put("itemShortUrlExpired",this.getItemShortUrlExpired());
        params.put("itemState",this.getItemState());
        params.put("itemUrl",this.getItemUrl());
        params.put("itemType",this.getItemType());
        params.put("number",this.getNumber());
        params.put("onsaleTime",this.getOnsaleTime());
        params.put("pictureUrl",this.getPictureUrl());
        params.put("price",this.getPrice());
        params.put("relateItemIds",this.getRelateItemIds());
        params.put("remark",this.getRemark());
        params.put("sellerCids",this.getSellerCids());
        params.put("tagIds",this.getTagIds());
        params.put("title",this.getTitle());
        params.put("validthru",this.getValidthru());
        params.put("weight",this.getWeight());
        params.put("platform",this.getPlatform());
        params.put("Id",this.getId());
        params.put("salesCount",this.getSalesCount());
        params.put("outSid",this.getOutSid());
        params.put("shopId",this.getShopId());
        params.put("skus",this.getSkus());
        return params;
    }
}
