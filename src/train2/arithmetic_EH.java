package train2;

import java.util.Scanner;

public class arithmetic_EH {

	public static void main(String[] args) 
	{
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		try
		{
			System.out.println(" Quotient = "+a/b);
		}
		catch (ArithmeticException e)
		{
			System.out.println("please enter any other number " + e);
		}
		finally 
		{
			s.close();
		}
	}

}
