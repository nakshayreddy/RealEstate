package BusinessLogic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNum {
	public String Phone()
	{
		//phonenumber validation
		System.out.println("Enter your Number");	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		if(isvalidnumber(num))
		{
			return num;
			
		}
		else
		{
			System.out.println("\tPlease Enter Valid Number");
			return Phone();
			
		}
		
	}
	public boolean isvalidnumber(String num)
	{
		String numRegex ="^[789]\\d{9}$";
		
		Pattern pattern = Pattern.compile(numRegex);
		if(num == null) 
			return false;
		return pattern.matcher(num).matches();
	}

}


