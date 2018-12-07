package com.nascent.ecrp.opensdk.test.coupon;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.coupon.FindCouponInfoRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.coupon.FindCouponInfoResponse;

import java.io.IOException;

public class FindCouponInfoTest {
    public static void main(String [] args) throws IOException, ApiException {
        FindCouponInfoRequest request = new FindCouponInfoRequest();
        request.setBrandId(100030L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");
        request.setReturnCount(true);
        //设置其他需要的参数
        request.setCouponCode("288914442929672");

        System.out.println(request.GetParameters());
        Long start_time = System.currentTimeMillis();
        System.out.println(start_time);
        DefaultOpenPlatformClient defaultPointClient = new DefaultOpenPlatformClient(
                request);
        getResponse(request,defaultPointClient);
        Long end_time = System.currentTimeMillis();
        System.out.println(end_time);
        System.out.println("耗时:"+(end_time-start_time));
    }

    private static void getResponse(FindCouponInfoRequest request, DefaultOpenPlatformClient defaultPointClient) {
        try {
            FindCouponInfoResponse response = defaultPointClient.execute(request);
            System.out.println("hh"+response.getStoreCoupon().getAfterGetValidDays());
//            System.out.print(response.getSuccess());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
