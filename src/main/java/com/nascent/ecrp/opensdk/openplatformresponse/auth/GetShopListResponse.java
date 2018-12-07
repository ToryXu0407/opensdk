package com.nascent.ecrp.opensdk.openplatformresponse.auth;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.auth.ShopInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:11:45
 * 查询店铺列表接口
 */
@Getter
@Setter
public class GetShopListResponse extends BaseResponse {

    /**
     * 店铺属性
     */
    private List<ShopInfo> result;

}
