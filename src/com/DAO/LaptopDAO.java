package com.DAO;

public interface LaptopDAO {
	
	String FetchAll();
	Laptop input();
	String insert(Laptop laptop);
	String update(Laptop laptop);
	String delete(int laptopid);
}
