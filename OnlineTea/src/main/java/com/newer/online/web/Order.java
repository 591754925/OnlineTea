package com.newer.online.web;

import java.util.Arrays;

/**
 * 订单实体类
 * @author Charlene
 *
 */

public class Order {
	/**
	 * 订单编号
	 */
	private String id;
	
	/**
	 * 饮品
	 */
	private String name;
	
	/**
	 * 规格
	 */
	private String size;
	
	/**
	 * 甜度
	 */
	private String sweetness;
	
	/**
	 * 温度
	 */
	private String temp;
	
	/**
	 * 辅料
	 */
	private String[] access;
	
	/**
	 * 状态
	 */
	private String tagle;

	
	public Order() {
		
	}
	
	
	public Order( String name, String size, String sweetness, String temp, String[] access, String tagle) {
		super();
		this.name = name;
		this.size = size;
		this.sweetness = sweetness;
		this.temp = temp;
		this.access = access;
		this.tagle = tagle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSweetness() {
		return sweetness;
	}

	public void setSweetness(String sweetness) {
		this.sweetness = sweetness;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String[] getAccess() {
		return access;
	}

	public void setAccess(String[] access) {
		this.access = access;
	}

	public String getTagle() {
		return tagle;
	}

	public void setTagle(String tagle) {
		this.tagle = tagle;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", size=" + size + ", sweetness=" + sweetness + ", temp=" + temp
				+ ", access=" + Arrays.toString(access) + ", tagle=" + tagle + "]";
	}
	
	
	
}
