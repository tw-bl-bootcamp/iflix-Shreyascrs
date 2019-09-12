package com.thoughtworks.bootcamp.response;

public class Response {
	private int statusCode;
	private String message;
	private String data;

	public Response(int statusCode, String message, String data) {
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}

	public Response sendresponse(int statusCode, String message, String data) {
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
		return this;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
