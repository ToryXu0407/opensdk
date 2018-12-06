package com.nascent.ecrp.opensdk.openplatformdomain.auth;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:15:52
 * 店铺信息
 * 所在接口：查询店铺列表接口
 */
@Setter
@Getter
public class ShopInfo {

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 店铺名称
     */
    private String shopName;


}
