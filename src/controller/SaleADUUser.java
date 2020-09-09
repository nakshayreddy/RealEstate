package controller;


//the user where he can only add display
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;


import dao.SaleDAO;

import model.SaleDetails;
import model.UserDetails;

public class SaleADUUser {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void addsales() throws Exception
	{
		
		
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Enter place");
		String place=br.readLine();
		System.out.println("Enter city");
		String city=br.readLine();
		System.out.println("Enter cost");
		String cost=br.readLine();
		System.out.println("Enter type");
		String type=br.readLine();
		System.out.println("Enter remarks");
		String remarks=br.readLine();
		SaleDetails sd=new SaleDetails();
		sd.setName(name);	
		sd.setPlace(place);
		sd.setCity(city);
		sd.setCost(cost);
		sd.setType(type);
		sd.setRemarks(remarks);
		
		SaleDAO sdao=new SaleDAO();
		sdao.insertsale(sd);
		System.out.println("INSERTED SUCCESSFULL");
//		AdminMain sm=new AdminMain();
//		sm.sale();
		UserDetailsADD ud=new UserDetailsADD();
		ud.sale1();
		
	}
	public void deletesales() throws Exception
	{
		
		
		System.out.println("Enter Name");
		String name=br.readLine();
		SaleDAO sdao=new SaleDAO();
		sdao.deletesale(name);
		System.out.println("DELETED SUCCESSFULL");
		AdminMain sm=new AdminMain();
		sm.sale();

		
	}
	
	public void updatesales() throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Enter place");
		String place=br.readLine();
		System.out.println("Enter city");
		String city=br.readLine();
		System.out.println("Enter cost");
		String cost=br.readLine();
		System.out.println("Enter type");
		String type=br.readLine();
		System.out.println("Enter remarks");
		String remarks=br.readLine();
		SaleDetails sd=new SaleDetails();
		sd.setName(name);	
		sd.setPlace(place);
		sd.setCity(city);
		sd.setCost(cost);
		sd.setType(type);
		sd.setRemarks(remarks);
		SaleDAO sdao=new SaleDAO();
		sdao.updatesale(sd);
		System.out.println("UPDATED SUCCESSFULL");
		AdminMain sm=new AdminMain();
		sm.sale();
		
	}
	
	public void display() throws SQLException, Exception
	{
		SaleDAO sdao=new SaleDAO();
		List<SaleDetails> lb=sdao.selectallsales();
		System.out.println("DISPLAYING DETAILS");
		for(SaleDetails sd:lb)
		{
			
			System.out.println("name: "+sd.getName()+"\t place: "+sd.getPlace()
			+"\t city: "+sd.getCity()+"\t cost: "+sd.getCost()+"\t type: "+sd.getType()
			+"\t remarks: "+sd.getRemarks());
			
			
			
			
		}
//		AdminMain sm=new AdminMain();
//		sm.sale();
		UserDetailsADD ud=new UserDetailsADD();
		ud.sale1();
		
		
	}
	public void selectype() throws Exception
	{
		SaleDAO sdao=new SaleDAO();
		
			sdao.selectbycity();
		
		
		
		
	}
}





//
//SaleDetails sd=new SaleDetails();
//UserDetails du=new UserDetails();
//sd.setName(name);


