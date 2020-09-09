package controller;
//values entered duing registeration and login of user
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.UserDAO;
import model.UserDetails;




public class UserRL {

	
	 public void Register() throws Exception {
		 
			
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Name");
			String name=br.readLine();
			BusinessLogic.EmailValidation e1=new BusinessLogic.EmailValidation();
			String email=e1.Email();
//			System.out.println("Enter email");
//			String email=br.readLine();
			System.out.println("Enter password");
			String password=br.readLine();
			BusinessLogic.PhoneNum n1=new BusinessLogic.PhoneNum();
			String contact=n1.Phone();
//			System.out.println("Enter contact");
//			String contact=br.readLine();
			System.out.println("Enter city");
			String city=br.readLine();
			System.out.println("Enter gender");
			String gender=br.readLine();
			UserDetails ud=new UserDetails();
			ud.setName(name);
			ud.setEmail(email);
			ud.setPassword(password);
			ud.setContact(contact);
			ud.setCity(city);
			ud.setGender(gender);
			
			UserDAO userdao = new UserDAO();
			userdao.signUp(ud);
			System.out.println("REGISTERATION SUCCESS");
         
    }
	 public void login() throws Exception   {
		 
		Scanner sc= new Scanner(System.in);
		boolean b=false;
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter password");
			String password=sc.next();
			UserDetails ud=new UserDetails();
			ud.setName(name);
		    ud.setPassword(password);
			UserDAO userdao = new UserDAO();
			 b=userdao.loginUser(ud);
			if(b==true)
			{
				System.out.println("LOGIN SUCCESS");	
			}
			else
			{
				System.out.println("LOGIN NOT SUCCESS");	
			}
			
			
      
 }

	

}

