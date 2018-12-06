package com.nascent.ecrp.opensdk.openplatformresponse.goods;

import com.nascent.ecrp.opensdk.BaseResponse;
import lombok.Getter;
import lombok.Setter;

/**
 * 新增/更新单个商品响应
 * Created by Lijian on 2018/11/28.
 */
@Setter
@Getter
public class SaveGoodResponse extends BaseResponse {

    //商品
    private String item;
    //错误信息
    private String msg;
    //外部商品Id
    private String outItemId;

}
