package com.nascent.ecrp.opensdk.test.point;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.point.ReduceIntegralRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.point.ReduceIntegralResponse;

import java.io.IOException;
import java.math.BigDecimal;

public class ReduceIntegralTest {

    public static void main(String [] args) throws IOException, ApiException {

        ReduceIntegralRequest request = new ReduceIntegralRequest();

        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");
        request.setServerUrl("http://localhost:9091");

        //设置其他需要的参数
        request.setNick("账号531");
        request.setNickType(1);
//        request.setCustomerId(2329428000313667L);
        request.setBusinessName("普通扣减2");
        request.setPoint(BigDecimal.valueOf(15));
        request.setReduType(3);
        request.setRemark("今天雾霾");

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

    private static void getResponse(ReduceIntegralRequest request, DefaultOpenPlatformClient defaultOpenPlatformClient) {
        try {
            ReduceIntegralResponse response = defaultOpenPlatformClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
