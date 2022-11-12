package com.DAO;

public class Laptop {
	
	private int laptopid;
	private String brandname;
	private String modelname;
	private int costprice;
	private int saleprice;
	private String currentstatus;
	public int getLaptopid() {
		return laptopid;
	}
	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getCostprice() {
		return costprice;
	}
	public void setCostprice(int costprice) {
		this.costprice = costprice;
	}
	public int getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}
	public String getCurrentstatus() {
		return currentstatus;
	}
	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}
	
	Laptop(){
		
	}
	
	Laptop(int laptopid, String brandname, String modelname, int costprice, int saleprice, String currentstatus){
		this.laptopid=laptopid;
		this.brandname=brandname;
		this.modelname=modelname;
		this.costprice=costprice;
		this.saleprice=saleprice;
		this.currentstatus=currentstatus;
	}
}
