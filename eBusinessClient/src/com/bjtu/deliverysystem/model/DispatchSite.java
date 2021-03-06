package com.bjtu.deliverysystem.model;

import java.io.Serializable;

public class DispatchSite implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;   //id
    private String address;  //配送点详细地址
    private String siteNo;
    private String name;   //配送点名称
    private int level;    //配送点级别：1、一级  2、二级 3、三级
    
    
	public String getSiteNo() {
		return siteNo;
	}
	public void setSiteNo(String siteNo) {
		this.siteNo = siteNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
    
}
