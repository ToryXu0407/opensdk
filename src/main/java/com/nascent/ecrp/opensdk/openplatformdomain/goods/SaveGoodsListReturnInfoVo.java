package com.nascent.ecrp.opensdk.openplatformdomain.goods;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Lijian
 * 2018/11/29
 * 返回数据
 * 所在接口：批量新增/更新商品数据
 */
@Setter
@Getter
public class SaveGoodsListReturnInfoVo {

    //商品
    private String item;
    //错误信息
    private String msg;
    //外部商品Id
    private String outItemId;

}
