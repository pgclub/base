package com.techli.base.web.model;

public class ResultJson {

	public static final ResultJson TRUE = new ResultJson("操作成功", true, null);
	public static final ResultJson FALSE = new ResultJson("操作失败", false, null);

	private String message;
	private boolean state;
	private Object result;

	public ResultJson() {
	}

	public ResultJson(String message, boolean state, Object result) {
		this.message = message;
		this.state = state;
		this.result = result;
	}

	public static ResultJson trueState(String message, Object result) {
		return new ResultJson(message, true, result);
	}

	public static ResultJson falseState(String message, Object result) {
		return new ResultJson(message, false, result);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
