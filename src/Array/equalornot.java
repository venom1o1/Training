package Array;

import java.util.Scanner;
import java.util.Arrays;

public class equalornot 
{	
	public static void main(String[] args) 
	{
		int size , i , j=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		size = s.nextInt();
		int [] a = new int[size];
		int [] b = new int[size];
		System.out.println("Enter array 1 elements : ");
		
		for(i=0; i<size;i++)
		{
			a[i] = s.nextInt();			
		}
		System.out.println("Enter array 2 elements : ");
		
		for(i=0; i<size;i++)
		{
			b[i] = s.nextInt();			
		}
		for(i=0; i<size;i++)
		{
			if(a[i]!=b[i])
			{
				System.out.println("Elements are not equal");
				j=1;
				break;
			}
			else
				j=0;	
		}
		if(j==0)
		{
			System.out.println("Arrays are equal");
			Arrays.sort(a);
			Arrays.sort(b);
		
			System.out.println("Sorted Array 1 : ");
			for(i=0; i<size;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("Sorted Array b : ");
			for(i=0; i<size;i++)
			{
				System.out.println(b[i]);
			}
		}	
	}
}
