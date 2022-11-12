package com.DAO;

public class LaptopDAOFactory {
	public static LaptopDAO createLaptopDAO() {
		return (new LaptopDAOImpl());
	}
}
