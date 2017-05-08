package com.integration.entity;

public class User{
	private int id;					//用户标识
	private String name;			//用户名
	private String password;		//密码
	private String type;			//类型
	//默认构造方法
	public User() {
	}
	//包含全部属性的构造方法
	public User(int id, String name, String password, String type) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.type = type;
	}
	// 各个属性的getter和setter方法
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
