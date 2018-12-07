package com.nascent.ecrp.opensdk.test.goods;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.OpenSku;
import com.nascent.ecrp.opensdk.openplatformrequest.goods.SaveGoodRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.goods.SaveGoodResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaveGoodsTest {

    public static void main(String [] args) throws IOException, ApiException {

        SaveGoodRequest request = new SaveGoodRequest();

        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");
        request.setAppSecret("733d7be2196ff70efaf6913fc8bdcabf");

        //设置其他需要的参数
        request.setNonce("1543828830");
        request.setIsHasDiscount(1);
        request.setIsVirtual(1);
        request.setItemType("fixed");
        request.setOutItemId("1543546073");
        request.setOutSid("1543546132");
        request.setPictureUrl("http://img.zcool.cn/community/01cfdb57634ed20000012e7e735d90.jpg@1280w_1l_2o_100sh.png");
        List<OpenSku> openSkusList = new ArrayList<OpenSku>();
        OpenSku openSku = new OpenSku();
        openSku.setPrice(BigDecimal.valueOf(15));
        openSku.setProperties("111");
        openSku.setPropertiesName("一一一");
        openSku.setQuantity(BigDecimal.valueOf(1));
        openSkusList.add(openSku);
        request.setSkus(openSkusList);
        request.setValidthru(30);

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

    private static void getResponse(SaveGoodRequest request, DefaultOpenPlatformClient defaultOpenPlatformClient) {
        try {
            SaveGoodResponse response = defaultOpenPlatformClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
