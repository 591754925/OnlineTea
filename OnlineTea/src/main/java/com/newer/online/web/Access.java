package com.newer.online.web;

public class Access {
	
	private String name;

	public Access() {
		
	}
	
	public Access(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Access [Name=" + name + "]";
	}
	
	
	
}
