package com.nascent.ecrp.opensdk.openplatformresponse.subdivision;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.subdivision.BrandSubdivisionInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * 获取某品牌下的分组列表响应
 * Created by Lijian on 2018/11/29.
 */
@Setter
@Getter
public class SelectSubdivisionListResponse extends BaseResponse {

    /**
     * 品牌分组信息List
     */
    private List<BrandSubdivisionInfo> brandInfoList;
}
