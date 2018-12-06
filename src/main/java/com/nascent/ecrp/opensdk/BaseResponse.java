package com.nascent.ecrp.opensdk;

import java.io.Serializable;
import java.util.Map;

public abstract class BaseResponse implements Serializable {
	 /**
	 * 版本号
	 */
	private static final long serialVersionUID = 1L;	
	/**
     * 错误码
     */
    private String errCode;
    /**
     * 错误信息
     */
    private String errMsg;
    /**
     * 是否异常
     * @return
     */
    public Boolean error;
	/**
	 * API响应JSON
	 */
    private String body;
    /**
     * API请求参数列表
     */
	private Map<String, Object> params;
    
	public String getErrCode() {
		return errCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getBody() {
		return body;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
    public Boolean getError() {
        return error;
    }
    public void setError(Boolean error) {
        this.error = error;
    }
}
