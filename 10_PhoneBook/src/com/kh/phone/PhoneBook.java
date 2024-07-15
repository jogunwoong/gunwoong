package com.kh.phone;

public class PhoneBook {
	private String name;
	private String phone;
	private String group;
	private String email;
	private String memo;
	
	
	public PhoneBook(String name, String phone, String group, String email, String memo) {
		this.name = name;
		this.phone = phone;
		this.group = group;
		this.email = email;
		this.memo = memo;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getGroup() {
		return group;
	}


	public void setGroup(String group) {
		this.group = group;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
	    return "PhoneEntry{" +
	            "name='" + name + '\'' +
	            ", phone='" + phone + '\'' +
	            ", group='" + group + '\'' +
	            ", email='" + email + '\'' +
	            ", memo='" + memo + '\'' +
	            '}';
	}
}

