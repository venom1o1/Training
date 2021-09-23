package Array;

import java.util.Scanner;

public class negnumbers 
{
	public static void main(String[] args) 
	{
		int size,i, count=0;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array : ");
		size = s.nextInt();
	
		int [] a  = new int[size];
		
		System.out.println("Enter the elements in array : ");
		
		for(i=0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Negative number in the array are : ");
		for(i=0;i<size;i++)
		{
			if(a[i]<0)
				{System.out.println(a[i]);
				count++;}
		}
		System.out.println("Total negative numbers are: "+ count);
		
		

	}

}
