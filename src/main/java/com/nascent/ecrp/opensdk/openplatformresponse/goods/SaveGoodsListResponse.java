package com.nascent.ecrp.opensdk.openplatformresponse.goods;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.SaveGoodsListReturnInfoVo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 批量新增/更新商品数据响应
 * * Created by Lijian on 2018/11/29.
 */
@Setter
@Getter
public class SaveGoodsListResponse extends BaseResponse {

    /**
     * 参数校验失败数据
     */
    List<SaveGoodsListReturnInfoVo> paramErrorList;

    /**
     * 保存失败商品
     */
    List<SaveGoodsListReturnInfoVo> returnList;
}
