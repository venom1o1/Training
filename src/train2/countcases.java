package train2;
import java.util.Scanner;
public class countcases {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
		String fromuser = s.nextLine();
		int u=0, l=0, num=0, spec=0,i;
		for(i=0;i<fromuser.length();i++)
		{
			char test = fromuser.charAt(i);
			if (test >= 'A' && test <= 'Z')
                u++;
            else if (test >= 'a' && test <= 'z')
                l++;
            else if (test >= '0' && test <= '9')
                num++;
            else
                spec++;
		}
		System.out.println("Total upper case characters = "+u +"\nTotal lowercase characters = "+ l+"\nTotal number = "+ num +"\nTotal special characters = "+ spec);
		
	}

}
