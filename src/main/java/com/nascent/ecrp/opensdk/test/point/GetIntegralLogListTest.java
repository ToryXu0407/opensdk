package com.nascent.ecrp.opensdk.test.point;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.point.GetIntegralLogListRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.point.GetIntegralLoglistResponse;

import java.io.IOException;

public class GetIntegralLogListTest {

    public static void main(String [] args) throws IOException, ApiException {

        GetIntegralLogListRequest request = new GetIntegralLogListRequest();

        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("d10b3c67512d4d4597b9982415c0e397");
        request.setAppKey("whd001");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");
        request.setServerUrl("http://localhost:9091");

        //设置其他需要的参数
        request.setNick("账号531");
        request.setNickType(1);
//        request.setCustomerId(2329428000313667L);
        request.setType(1);
        request.setStartID(0L);
        request.setPageNo(1);
        request.setPageSize(5);
        request.setStartTime("2018-11-11 10:00:00");
        request.setEndTime("2018-12-11 10:00:00");

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

    private static void getResponse(GetIntegralLogListRequest request, DefaultOpenPlatformClient defaultOpenPlatformClient) {
        try {
            GetIntegralLoglistResponse response = defaultOpenPlatformClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
