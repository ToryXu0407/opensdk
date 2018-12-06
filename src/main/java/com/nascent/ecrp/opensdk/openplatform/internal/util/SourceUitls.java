//package com.nascent.cloud.pointapi.openplatform.internal.util;
//
//import com.alibaba.fastjson.JSON;
//
//import java.io.IOException;
//
//public class SourceUitls {
//    private static String appKey = null;
//    private static String appCode = null;
//    private static String url = null;
//
//    public static void setAppkey(String key, String serverUrl) {
//        if (null == url) {
//            url = serverUrl;
//        }
//        if (null == appKey) {
//            appKey = key;
//        }
//    }
//
//    public static String getSource() {
//        if (null == appCode) {
//            if (null != url && null != appKey) {
//                AppCodeGetRequest req = new AppCodeGetRequest();
//                PointHashMap txtParams = new PointHashMap();
//                txtParams.put("appKey", appKey);
//
//                String body = null;
//                try {
//                    body = WebUtils.doPost(url + req.GetApiName(), txtParams, 180000, 180000);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                AppCodeGetResponse rsp = JSON.parseObject(body, req.getResponseClass());
//
//                appCode = rsp.getAppCode();
//            }
//        }
//        return appCode;
//    }
//}
