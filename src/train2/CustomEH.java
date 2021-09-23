package train2;

import java.util.Scanner;
public class CustomEH {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int exp;
		System.out.println("enter user experience :");
		exp=s.nextInt();
		if (exp<5)
		{
			try
			{
				throw new InvalidExpException();
			}catch(InvalidExpException e){
				System.out.println("you need more experience ");
			}		
		}
		else
		{
			System.out.println("Welcome ");
		}	
	}
}
