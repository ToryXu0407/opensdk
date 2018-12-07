package com.nascent.ecrp.opensdk.test.customer;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.customer.FindCustomerRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.FindCustomerResponse;

import java.io.IOException;

public class FindCustomerTest {
    public static void main(String [] args) throws IOException, ApiException {
        FindCustomerRequest request = new FindCustomerRequest();
        request.setBrandId(100030L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("cb940f917fda4e3e8325667d9bf94c6f");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");
        //设置其他需要的参数
        request.setCustomerId(2071431535002540L);
        request.setNick("o9BzKw6scOxz16D3P_9vTH9cWDu8");
        request.setNickType(19);
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

    private static void getResponse(FindCustomerRequest request, DefaultOpenPlatformClient defaultPointClient) {
        try {
            FindCustomerResponse response = defaultPointClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
