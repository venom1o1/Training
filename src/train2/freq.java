package train2;

import java.util.Scanner;

public class freq {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String user = s.nextLine();
		int[] frequ = new int[user.length()];
		char user1[]= user.toCharArray();
		for (int i = 0; i<user.length();i++)
		{
			frequ[i]=1;
			for(int j = i+1; j <user.length(); j++)
			{
				if(user1[i]==user1[j])
				{
					frequ[i]++;
					user1[j]='0';
				}
			}
		}
		System.out.println("Frequencies are as follows : \n");
		for(int i =0;i<frequ.length;i++)
		{
			if(user1[i] != ' ' && user1[i] != '0')
			{
				System.out.println(user1[i]+"   "+frequ[i]);
			}
		}
	}

}
