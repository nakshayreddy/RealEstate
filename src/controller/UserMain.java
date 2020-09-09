package controller;
//registeration and login of the user
import java.util.Scanner;

public class UserMain {
	public void user() throws Exception
	{
//		System.out.println("=============================================");
//		System.out.println("        WELCOME TO REAL ESTATE  ");
//		System.out.println("=============================================");

		System.out.println();
		System.out.println("*****CHOOSE ANY ONE OPTION*****");
		System.out.println();
		System.out.println("       1. REGISTRATION");
		System.out.println("       2. LOGIN");
		//System.out.println("3. ADMIN LOGIN");
		
		int option;
		 
		Scanner sc= new Scanner(System.in);
		do {
			
		    option =sc.nextInt();
	        switch(option)
	        {
	        case 1:
	        	UserRL r1=new UserRL();
	        	r1.Register();
	        	System.out.println("       1. REGISTRATION");
	    		System.out.println("       2. LOGIN");
	    		System.out.println("       3. Go To Main");
	        	break;
	        case 2:

	        	UserRL r2=new UserRL();
	        	r2.login();
	        	UserDetailsADD s1=new UserDetailsADD();
	        	s1.sale1();
	        	break;
	        	
	        case 3:
	        	Main r3=new Main();
	        	r3.main(null);
	        	break;	
	        default:
	        	
	        }
		}while(option!=3);
	}

}
