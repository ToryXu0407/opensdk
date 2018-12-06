package com.nascent.ecrp.opensdk.openplatform;
import com.nascent.ecrp.opensdk.ApiException;
import com.nascent.ecrp.opensdk.BaseRequest;
import com.nascent.ecrp.opensdk.BaseResponse;

public interface OpenPlatformClient {
	/**
	 * 执行公开API请求。
	 *
	 * @param <T> 具体的API响应类
	 * @param request 具体的API请求类
	 * @return 具体的API响应
	 */
	public <T extends BaseResponse> T execute(BaseRequest<T> request) throws ApiException;

}
