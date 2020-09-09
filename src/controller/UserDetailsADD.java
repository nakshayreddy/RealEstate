package controller;
//user in which he can add ,display and check the builders
import java.util.Scanner;

public class UserDetailsADD {
	public void sale1() throws Exception{
		System.out.println("*****CHOOSE ANY ONE OPTION*****");
		System.out.println();
		System.out.println("       1. ADD");
		System.out.println("       2. DISPLAY");
		System.out.println("       3. BUILDERS");
		System.out.println("       4. LOGOOUT USER");
		
		int option;
		 
		Scanner sc= new Scanner(System.in);
		do {
			
		    option =sc.nextInt();
	        switch(option)
	        {
	        case 1:
	        	SaleADUUser r1=new SaleADUUser();
	        	r1.addsales();
	        	break;
	        case 2:
	        	SaleADUUser r4=new SaleADUUser();
	        	r4.display();
	        	break;
	        case 3:
	        	Builders r5=new Builders();
	        	r5.bul();
	        	break;
	        case 4:
	        	Main s1=new Main();
	        	s1.main(null);
	        	break;
	       
	        default:
	        	System.out.println("Choice must be a value between 1 and 4.");
	        	
	        }
		}while(option!=5);
		
	}

}
