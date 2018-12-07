package com.nascent.ecrp.opensdk.openplatformresponse.auth;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.auth.BrandInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:11:45
 * 查询品牌列表接口
 */
@Getter
@Setter
public class GetBrandListResponse extends BaseResponse {

    /**
     * 品牌属性
     */
    private List<BrandInfo> result;


}
