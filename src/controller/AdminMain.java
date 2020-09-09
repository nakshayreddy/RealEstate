package controller;

import java.util.Scanner;

public class AdminMain {
	//performing operations like add delete update and display
	public void sale() throws Exception{
		System.out.println("*****CHOOSE ANY ONE OPTION*****");
		System.out.println();
		System.out.println("       1. ADD");
		System.out.println("       2. DELETE");
		System.out.println("       3. UPDATE");
		System.out.println("       4. DISPLAY");
		System.out.println("       5. LOGOOUT ADMIN");
		
		int option;
		 
		Scanner sc= new Scanner(System.in);
		do {
			
		    option =sc.nextInt();
	        switch(option)
	        {
	        case 1:
	        	SaleADU r1=new SaleADU();
	        	r1.addsales();
	        	break;
	        case 2:
	        	SaleADU r2=new SaleADU();
	        	r2.deletesales();
	        	break;
	        case 3:
	        	SaleADU r3=new SaleADU();
	        	r3.updatesales();
	        	break;
	        case 4:
	        	SaleADU r4=new SaleADU();
	        	r4.display();
	        	break;
	   
	        case 5:
	        	Main s1=new Main();
	        	s1.main(null);
	        	break;
	        case 7:
	        	SaleADU r7=new SaleADU();
	        	r7.selectype();
	        	break;	
	        default:
	        	System.out.println("Choice must be a value between 1 and 5.");
	        	
	        }
		}while(option!=6);
		
	}
	

}
