package com.nascent.ecrp.opensdk;

public class ApiException extends Exception {
	
	private static final long serialVersionUID = 1L;
	/**
     * 错误码
     */
    private String errCode = "-1";
    /**
     * 错误信息
     */
    private String errMsg;
    
	public String getErrCode() {
		return errCode;
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
    
	public ApiException() {
		super();
	}

	public ApiException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ApiException(String message) {
		super(message);
	}
	
	public ApiException(Throwable cause) {		
		super(cause);		
		this.errMsg = cause.getMessage();
	}
	
	public ApiException(String errCode, String errMsg) {
		super(errCode + ":" + errMsg);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
}
