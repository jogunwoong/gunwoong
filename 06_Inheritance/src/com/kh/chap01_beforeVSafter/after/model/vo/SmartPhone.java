package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
	
	private String mobileAgency;
	public SmartPhone() {}
	public String information() {
		return super.information()+"mobileAgency"+mobileAgency;
	}
	public SmartPhone(String brand, String code, String name, int price, String mobileAgency) {
		super(brand, code, name, price);
		this.mobileAgency = mobileAgency;
	}
	public SmartPhone(String mobileAgency) {
		super();
		this.mobileAgency = mobileAgency;
	}
	public String ismobileAgency() {
		return mobileAgency;
	}
	public void setmobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

}
