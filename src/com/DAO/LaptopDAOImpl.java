package com.DAO;
import java.sql.*;
import java.util.Scanner;
public class LaptopDAOImpl implements LaptopDAO {
	
	 String driver="com.mysql.cj.jdbc.Driver";
	 String dburl="jdbc:mysql://localhost:3306/mydb";
	 String username="root";
	 String password="";
	 
	 private Connection con=null;
	 
	 void openConnection() {
		 try {
			 Class.forName(driver);
			 con=DriverManager.getConnection(dburl, username, password);
			 System.out.println("connection established");
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }

	@Override
	public String FetchAll() {
		String res="";
		try {
			this.openConnection();
			String query="select * from laptop"
					+ " where "
					+ " currentstatus='InStock' ";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()==true) {
				for(int i=1;i<=6;i++) {
					res+=rs.getString(i)+"\t";
				}
				res+="\n";
			}
			rs.close();
			con.close();
			
		}
		catch(Exception e) {
			res=e.toString();
		}
		return res;
	}

	@Override
	public Laptop input() {
		Laptop laptop=new Laptop();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter brandname: ");
		laptop.setBrandname(sc.nextLine());
		
		System.out.print("Enter modelname: ");
		laptop.setModelname(sc.nextLine());
		
		System.out.print("Enter laptop's cost price: ");
		laptop.setCostprice(sc.nextInt());
		
		System.out.print("Enter laptop's sale price: ");
		laptop.setSaleprice(sc.nextInt());
		
		System.out.print("Enter Laptop id: ");
		laptop.setLaptopid(sc.nextInt());
		
		return (laptop);
	}

	@Override
	public String insert(Laptop laptop) {
		String res="";
		try {
			this.openConnection();
			String query="insert into laptop values(?, ?, ?, ?, ?, ?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, laptop.getLaptopid());			
			ps.setString(2, laptop.getBrandname());
			ps.setString(3, laptop.getModelname());
			ps.setInt(4, laptop.getCostprice());
			ps.setInt(5, laptop.getSaleprice());
			ps.setString(6, "InStock");
			int result=ps.executeUpdate();
			res=result+" record/s sucessfully inserted into laptop";
			ps.close();
			con.close();
		}
		catch(Exception e) {
			res=e.toString();
		}
		return res;
	}

	@Override
	public String update(Laptop laptop) {
		String res="";
		try {
			openConnection();
			String query="update laptop set "
					+ "brandname=?, "
					+ "modelname=?, "
					+ "costprice=?, "
					+ "saleprice=?, "
					+ "currentstatus=? "
					+ "where "
					+ "laptopid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, laptop.getBrandname());
			ps.setString(2, laptop.getModelname());
			ps.setInt(3, laptop.getCostprice());
			ps.setInt(4, laptop.getSaleprice());
			ps.setString(5, "InStock");
			ps.setInt(6, laptop.getLaptopid());
			int result=ps.executeUpdate();
			res=result+" record/s updated from table laptop";
			ps.close();
			con.close();
		}
		catch(Exception e ) {
			res=e.toString();
		}
		return res;
	}

	@Override
	public String delete(int laptopid) {
		String res="";
		try {
			openConnection();
			String query="update laptop set "
					+ "currentstatus='OutOfStock' "
					+ "where laptopid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, laptopid);
			int result=ps.executeUpdate();
			res=result+" record/s deleted sucessfully from laptop table";
			ps.close();
			con.close();
		}
		catch(Exception e) {
			res=e.toString();
		}
		return res;
	}

}
