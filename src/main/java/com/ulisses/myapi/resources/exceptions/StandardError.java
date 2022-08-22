package com.ulisses.myapi.resources.exceptions;

public class StandardError {
	private Integer status;
	private Long timStamp;
	private String message;

	public StandardError() {
		super();
	}

	public StandardError(Integer status, Long timStamp, String message) {
		super();
		this.status = status;
		this.timStamp = timStamp;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTimStamp() {
		return timStamp;
	}

	public void setTimStamp(Long timStamp) {
		this.timStamp = timStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
