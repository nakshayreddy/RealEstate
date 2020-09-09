package controller;

import java.util.Scanner;



public class Builders {
	//it contains of all the builders present for the construction purpose
	

	public void bul() throws Exception {
		// TODO Auto-generated method stub
		int option;
		String builders[]= {"Aparna Constructions","Ashoka Developers","Jain Housing","Nest",
				"MyHome Constructions","Prestige Group","Ramky Group","Ncc Urban","Smr Housing",
				"Ark"};
		
		do {
			 System.out.println("Enter your Builders option");
			 System.out.println("1. CERTIFIED");
			 System.out.println("2. NON-CERTIFIED");
			 System.out.println("3. GO BACK");
			 System.out.println("Enter \"1\", \"2\" or \"3\"");
			 
			 @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			 option=sc.nextInt();
			 switch(option)
			 {
			 case 1:
				 System.out.println(builders[0]);
				 System.out.println(builders[1]);
				 System.out.println(builders[2]);
				 System.out.println(builders[3]);
				 System.out.println(builders[4]);
				 System.out.println("");
				 break;
			 case 2:
				 System.out.println(builders[5]);
				 System.out.println(builders[6]);
				 System.out.println(builders[7]);
				 System.out.println(builders[8]);
				 System.out.println(builders[9]);
				 System.out.println("");
				 break;
			 case 3:
				 UserDetailsADD ud=new UserDetailsADD();
					ud.sale1();
				 
			 default:
	                System.out.println("Choice must be a value between 1 and 3.");	 
			 }
			 
			 
		}while(option!=3);
		
	}

	

}
