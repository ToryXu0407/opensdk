package com.nascent.ecrp.opensdk.openplatformdomain.auth;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/27
 * Time:15:51
 * 品牌信息
 * 所在接口：查询品牌列表接口
 */
@Setter
@Getter
public class BrandInfo {

    /**
     * 品牌guid
     */
    private String brangGuid;

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     * 品牌名称
     */
    private String brandName;

}
