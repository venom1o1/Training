package train2;

import java.util.Scanner;

public class count_char {

	public static void main(String[] args)  
	{
		int i, count=0;
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string : ");
		String fromuser =s.nextLine();
		System.out.println("Enter the character you want to search :");
		char search = s.next().charAt(0);
		for(i=0;i<fromuser.length();i++)
		{
			if(fromuser.charAt(i)==search)
			{
				count++;
			}
		}
		System.out.println(search+" appeared "+count+" number of times");
		
	}

}
