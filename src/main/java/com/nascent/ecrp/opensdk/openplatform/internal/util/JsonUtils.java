package com.nascent.ecrp.opensdk.openplatform.internal.util;

/**
 * @title 
 * @author zhangwm
 * @date 2018年10月9日
 */
public class JsonUtils {

	/**
	 * json字符串 转成Map
	 * @return
	 */
	public static PointHashMap jsonStrToMap(String prefix, String jsonStr){
		PointHashMap params = new PointHashMap();
		jsonStr = jsonStr.substring(1, jsonStr.length()-1).replace("\"", "");
		String[] strArray = jsonStr.split(",");
		for(String str : strArray){
			String[] array = str.split(":");
			params.put(prefix+array[0], array[1]);
		}
		return params;
	}
}
