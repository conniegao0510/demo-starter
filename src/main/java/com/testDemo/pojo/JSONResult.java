package com.testDemo.pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * custom data structure 200: success 500: error, error message save in msg
 * field 501: bean verification error 502: Interceptor intercepts user's token
 * is wrong 555: throws exception
 * 
 * @author cgao
 *
 */
public class JSONResult {

	// json Object
	private static final ObjectMapper MAPPER = new ObjectMapper();

	// response status
	private Integer status;

	// response message
	private String msg;

	// response data package
	private Object data;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	private static JSONResult build(Integer status, String msg, Object data) {
		return new JSONResult(status, msg, data);
	}
	
	public JSONResult(Integer status, String msg, Object data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	public JSONResult(Object data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}
	
	public static JSONResult ok(Object data) {
		return new JSONResult(data);
	}
	
	public static JSONResult ok() {
		return new JSONResult(null);
	}
	
	public JSONResult errorMsg(String msg) {
		return new JSONResult(500,msg,null);
	}
	
	public JSONResult errorMap(String msg) {
		return new JSONResult(501,"error",data);
	}
	
	public JSONResult errorTokenMsg(String msg) {
		return new JSONResult(502,msg,null);
	}
	
	public static JSONResult errorException(String msg) {
		return new JSONResult(555,msg,null);
	}
	
	public JSONResult() {
		
	}
}
