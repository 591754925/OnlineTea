package com.newer.online.web;

public class Tea {
	
	private String tea;

	public Tea() {
		
	}
	
	public Tea(String tea) {
		super();
		this.tea = tea;
	}

	public String getTea() {
		return tea;
	}

	public void setTea(String tea) {
		this.tea = tea;
	}

	@Override
	public String toString() {
		return "TeaList [list=" + tea + "]";
	}
	
	
	
}
