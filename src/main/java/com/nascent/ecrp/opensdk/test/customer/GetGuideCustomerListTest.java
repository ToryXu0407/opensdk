package com.nascent.ecrp.opensdk.test.customer;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.customer.GetGuideCustomerListRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.customer.GetGuideCustomerListResponse;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GetGuideCustomerListTest {
    public static void main(String [] args) throws IOException, ApiException, ParseException {
        GetGuideCustomerListRequest request = new GetGuideCustomerListRequest();
        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");
        //设置其他需要的参数
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2018-10-24 15:31:03";
        request.setEndTime(time);
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

    private static void getResponse(GetGuideCustomerListRequest request, DefaultOpenPlatformClient defaultPointClient) {
        try {
            GetGuideCustomerListResponse response = defaultPointClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
