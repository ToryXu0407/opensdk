package com.nascent.ecrp.opensdk.test.subdivision;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformrequest.subdivision.SelectSubdivisionListRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.subdivision.SelectSubdivisionListResponse;

import java.io.IOException;

public class SelectSubdivisionListTest {

    public static void main(String [] args) throws IOException, ApiException {

        SelectSubdivisionListRequest request = new SelectSubdivisionListRequest();

        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");

        //设置其他需要的参数

        System.out.println(request.GetParameters());
        Long start_time = System.currentTimeMillis();
        System.out.println(start_time);
        DefaultOpenPlatformClient defaultPointClient = new DefaultOpenPlatformClient(
                request.getServerUrl(),request.getAppKey(),request.getAccessToken(),"733d7be2196ff70efaf6913fc8bdcabf"
        ,request.getGroupId(),request.getBrandId(), null);
        getResponse(request,defaultPointClient);
        Long end_time = System.currentTimeMillis();
        System.out.println(end_time);
        System.out.println("耗时:"+(end_time-start_time));
    }

    private static void getResponse(SelectSubdivisionListRequest request, DefaultOpenPlatformClient defaultOpenPlatformClient) {
        try {
            SelectSubdivisionListResponse response = defaultOpenPlatformClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
