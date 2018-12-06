package com.nascent.ecrp.opensdk;

import java.util.Map;

public interface BaseRequest<T extends BaseResponse> {
	
	/**
	 * 获取API名称。
	 * 
	 * @return API名称
	 */
	public String GetApiName();
	
	/**
	 * 获取方式类型
	 */
	public String getMethodType();
	
	/**
	 * 获取具体响应实现类的定义。
	 */
	public Class<T> getResponseClass();
	
	/**
	 * 获取所有的Key-Value形式的文本请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数值</li>
	 * </ul>
	 * 
	 * @return 文本请求参数集合
	 */
	public Map<String, Object> GetParameters();
	
}
