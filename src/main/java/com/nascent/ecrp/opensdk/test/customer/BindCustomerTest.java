package com.nascent.ecrp.opensdk.test.customer;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.customer.BindCustomerRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.BindCustomerResponse;

import java.io.IOException;

public class BindCustomerTest {
    public static void main(String [] args) throws IOException, ApiException {
        BindCustomerRequest request = new BindCustomerRequest();
        request.setBrandId(100030L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("x6i2QwM1NkKMFrsWkRMNxw==43E304E4ABB34E71A9D7061312173A56");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");
        //设置其他需要的参数
        request.setMobile("17681845755");
        request.setNick("test123nick15365638055510.04367727982624647");
        request.setBindType(0);
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

    private static void getResponse(BindCustomerRequest request, DefaultOpenPlatformClient defaultPointClient) {
        try {
            BindCustomerResponse response = defaultPointClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
