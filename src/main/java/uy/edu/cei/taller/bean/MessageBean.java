package uy.edu.cei.taller.bean;

public class MessageBean {

	private boolean error;
	private String msg;
	
	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MessageBean(boolean error) {
		
		this.error = error;
	}
	
	
	

}
