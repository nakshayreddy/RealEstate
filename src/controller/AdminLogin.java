package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdminLogin {
	//checking the admin name and password which are default
	public void log() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Enter password");
		String password=br.readLine();
		if(name.equals("admin") && password.equals("admin"))
		{
			System.out.println("Admin Login Successfull");
			AdminMain am=new AdminMain();
	        am.sale();
		}
		else
		{
			System.out.println("Admin Login UnSuccessfull");
			Main m1=new Main();
			m1.main(null);
			
		}
		
	}

}
