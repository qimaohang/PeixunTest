package com.hk.bean;

public class User {
	int t_id;
	String name;
	String password;
	String quanxian;
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQuanxian() {
		return quanxian;
	}
	public void setQuanxian(String quanxian) {
		this.quanxian = quanxian;
	}
	@Override
	public String toString() {
		return "User [t_id=" + t_id + ", name=" + name + ", password=" + password + ", quanxian=" + quanxian + "]";
	}
}
