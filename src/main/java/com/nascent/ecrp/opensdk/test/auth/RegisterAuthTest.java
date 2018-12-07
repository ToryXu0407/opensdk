package com.nascent.ecrp.opensdk.test.auth;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.auth.RegisterAuthRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.auth.RegisterAuthResponse;

import java.io.IOException;

public class RegisterAuthTest {

    public static void main(String [] args) throws IOException, ApiException {

        RegisterAuthRequest request = new RegisterAuthRequest();

        request.setBrandId(null);
        request.setGroupId(100000121123123L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        request.setShopId(1000627L);
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");

        //设置其他需要的参数
        request.setExpiresTime("2018-12-12 00:00:00");

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

    private static void getResponse(RegisterAuthRequest request, DefaultOpenPlatformClient defaultOpenPlatformClient) {
        try {
            RegisterAuthResponse response = defaultOpenPlatformClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
