package com.nascent.ecrp.opensdk.openplatformdomain.trade;

import lombok.Getter;
import lombok.Setter;


/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:14:51
 */
@Getter
@Setter
public class PromotionDetailsInfo {


    /**
     *折价金额
     */
    private String discountFee	;

    /**
     *赠品的宝贝id
     */
    private String giftItemId;

    /**
     *满就送商品时，所送商品的名称
     */
    private String giftItemName;

    /**
     *满就送礼物的礼物数量
     */
    private String giftItemNum	;

    /**
     *交易的主订单或子订单号
     */
    private Long id;

    /**
     *优惠活动ID
     */
    private Boolean promotionActivityId;

    /**
     *优惠活动的描述
     */
    private String promotionDesc	;

    /**
     *优惠详情ID
     */
    private String promotionDetailId	;

    /**
     *优惠id
     */
    private String promotionId	;

    /**
     *优惠信息的名称
     */
    private String promotionName	;

    /**
     *营销工具ID
     */
    private String promotionToolId	;

}
