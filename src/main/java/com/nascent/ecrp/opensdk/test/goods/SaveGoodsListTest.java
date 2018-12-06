package com.nascent.ecrp.opensdk.test.goods;

import com.alibaba.fastjson.JSONObject;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.openplatform.DefaultOpenPlatformClient;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.OpenGoods;
import com.nascent.ecrp.opensdk.openplatformdomain.goods.OpenSku;
import com.nascent.ecrp.opensdk.openplatformrequest.goods.SaveGoodsListRequest;
import com.nascent.ecrp.opensdk.openplatformresponse.goods.SaveGoodsListResponse;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaveGoodsListTest {

    public static void main(String [] args) throws IOException, ApiException {

        SaveGoodsListRequest request = new SaveGoodsListRequest();

        request.setBrandId(100186L);
        request.setGroupId(120910104359001L);
        request.setAccessToken("9cf37c34bd5a44f98bb9313abf56fe15");
        request.setAppKey("whd001");
        request.setServerUrl("http://localhost:9091");

        //设置其他需要的参数
        List<OpenSku> openSkusList = new ArrayList<>();
        OpenSku openSku = new OpenSku();
        openSku.setPrice(BigDecimal.valueOf(15));
        openSku.setProperties("111");
        openSku.setPropertiesName("一一一");
        openSku.setQuantity(BigDecimal.valueOf(1));
        openSkusList.add(openSku);

        List<OpenGoods> openGoodsList = new ArrayList<>();
        OpenGoods openGoods = new OpenGoods();
        openGoods.setOutItemId("E86");
        openGoods.setPrice(BigDecimal.valueOf(100));
        openGoods.setOuterId("E86");
        openGoods.setSkus(openSkusList);
        openGoodsList.add(openGoods);

        request.setOpenGoodsList(openGoodsList);

        System.out.println(request.GetParameters());
        Long start_time = System.currentTimeMillis();
        System.out.println(start_time);
        DefaultOpenPlatformClient defaultPointClient = new DefaultOpenPlatformClient(
                request.getServerUrl(),request.getAppKey(),request.getAccessToken(),
                "733d7be2196ff70efaf6913fc8bdcabf",true
                ,request.getGroupId(),request.getBrandId(),null);
        getResponse(request,defaultPointClient);
        Long end_time = System.currentTimeMillis();
        System.out.println(end_time);
        System.out.println("耗时:"+(end_time-start_time));
    }

    private static void getResponse(SaveGoodsListRequest request, DefaultOpenPlatformClient defaultOpenPlatformClient) {
        try {
            SaveGoodsListResponse response = defaultOpenPlatformClient.execute(request);
            System.out.print(JSONObject.toJSONString(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
