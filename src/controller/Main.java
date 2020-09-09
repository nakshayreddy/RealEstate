package controller;

//Main class where the user and admin 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception 
	{
	
		System.out.println("=============================================");
		System.out.println("        WELCOME TO REAL ESTATE  ");
		System.out.println("=============================================");

		System.out.println();
		System.out.println("*****CHOOSE ANY ONE OPTION*****");
		System.out.println();
		System.out.println("       1. USER");
		System.out.println("       2. ADMIN");
		
		
		int option;
		 
		Scanner sc= new Scanner(System.in);
		do {
			
		    option =sc.nextInt();
	        switch(option)
	        {
	        case 1:
	        	UserMain um=new UserMain();
	        	um.user();
//	        	System.out.println("       1. REGISTRATION");
//	    		System.out.println("       2. LOGIN");
	        	break;
	        case 2:

	        AdminLogin am=new AdminLogin();
	        am.log();
	        	break;
	        default:
	        	
	        }
		}while(option!=3);
	}

	

}
