package BusinessLogic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	public String Email()
	{
		//Email validation 
		System.out.println("Enter your Email");	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		if(isvalidnumber(email))
		{
			return email;
			
		}
		else
		{
			System.out.println("\tPlease Enter Valid EmailId");
			return Email();
			
		}
	}
	public static boolean isvalidnumber(String email)
	{
		String emailregez="^[A-Za-z0-9+_.]+@(.+)$";
	
		Pattern pattern = Pattern.compile(emailregez);
		if(email == null) 
			return false;
		return pattern.matcher(email).matches();
	}
	
	
	

}