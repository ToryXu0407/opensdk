package com.nascent.ecrp.opensdk.openplatformresponse.customer;

import com.nascent.ecrp.opensdk.BaseResponse;
import com.nascent.ecrp.opensdk.openplatformdomain.customer.CustomerGuideInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/26
 * Time:15:47
 * 会员信息列表接口
 */
@Getter
@Setter
public class GetCustomerListByGuideResponse extends BaseResponse {

    /**
     * 会员信息列表集
     */
    private List<CustomerGuideInfo> customerGuideInfos;

    /**
     * 总数
     */
    private Long recordsTotal;

}
