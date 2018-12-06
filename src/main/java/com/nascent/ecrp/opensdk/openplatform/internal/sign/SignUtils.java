package com.nascent.ecrp.opensdk.openplatform.internal.sign;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;


public class SignUtils {

	/**
	 * 给请求签名
	 * @param params
	 * @param secret
	 * @return
	 * @throws IOException
	 */
	public static String signRequest(Map<String,Object> params, String secret) {
		// 第一步：检查参数是否已经排序
		String[] keys = params.keySet().toArray(new String[0]);
		Arrays.sort(keys);

		// 第二步：把所有参数名和参数值串在一起
		StringBuilder query = new StringBuilder(secret);
		for (String key : keys) {
			Object value = params.get(key);
			if(value!=null){
				query.append(key).append(value);
			}
		}
		//使用MD5加密
		try {
			return encryptMD5(query.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 第四步：使用MD5加密
	 * @param data
	 * @return
	 * @throws IOException
	 */
	private static String encryptMD5(String data) throws IOException {
		byte[] bytes = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			bytes = md.digest(data.getBytes("utf-8"));
		} catch (GeneralSecurityException e) {
			throw new IOException(e.getMessage());
		}

		return byte2hex(bytes);
	}

	/**
	 * 把二进制转化为大写的十六进制
	 * @param b
	 * @return
	 */
	private static String byte2hex(byte[] b) {
		StringBuilder hs = new StringBuilder();
		for(int n = 0; b != null && n < b.length; ++n) {
			String stmp = Integer.toHexString(b[n] & 255);
			if(stmp.length() == 1) {
				hs.append('0');
			}
			hs.append(stmp);
		}
		return hs.toString().toUpperCase();
	}

}
