package com.DAO;

import java.util.Scanner;

public class ProjectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		LaptopDAO laptopDAO=LaptopDAOFactory.createLaptopDAO();
		
		System.out.println("Welcome Dear User");
		while(true) {
			try {
				int choice;
				 System.out.println("To insert query enter '1' ");
				 System.out.println("To fetch all record enter '2' ");
				 System.out.println("To update an existing record enter '3' ");
				 System.out.println("To delete record enter '4' ");
				 System.out.println("To exist the programme enter '5' ");
				 System.out.println("-------------------------");
				
				 System.out.print("Enter your choice 1/2/3/4/5 ");
				 choice=sc.nextInt();
				 System.out.println("-------------------------");
				 switch(choice) {
				 case 1:
					 Laptop laptop=laptopDAO.input();
					 String result=laptopDAO.insert(laptop);
					 System.out.println(result);
					 System.out.println("----------");
					 break;
					 
				 case 2:
					 result=laptopDAO.FetchAll();
					 System.out.println(result);
					 System.out.println("------------");
					 break;
					 
				 case 3:
					 System.out.println("Enter information of existing record only: ");
					 laptop=laptopDAO.input();
					 result=laptopDAO.update(laptop);
					 System.out.println(result);
					 System.out.println("-------------");
					 break;
				 case 4:
					 System.out.print("Enter laptop id to delete: ");
					 int lapid=sc.nextInt();
					 result=laptopDAO.delete(lapid);
					 System.out.println(result);
					 System.out.println("-------------");
					 break;
				 case 5:
					 System.out.println("Thank you for using my software");
					 System.exit(0);
					 break;
				 }
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
