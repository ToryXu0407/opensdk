package com.nascent.ecrp.opensdk.test.customer;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.customer.GetCustomerListByGuideRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.GetCustomerListByGuideResponse;

import java.io.IOException;

public class GetCustomerListByGuideTest {
    public static void main(String [] args) throws IOException, ApiException {
        GetCustomerListByGuideRequest request = new GetCustomerListByGuideRequest();
        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");
        //设置其他需要的参数
        request.setShopId(1000676L);
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

    private static void getResponse(GetCustomerListByGuideRequest request, DefaultOpenPlatformClient defaultPointClient) {
        try {
            GetCustomerListByGuideResponse response = defaultPointClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
