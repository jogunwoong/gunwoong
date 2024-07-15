package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {
	private int inch;
	
	public Tv() {}
	
	public String information() {
		return super.information() +",inch="+inch;
		
	}

	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
}
	

