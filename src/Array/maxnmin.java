package Array;

import java.util.Scanner;
public class maxnmin {

	public static void main(String[] args)
	{
		int size,i, min,max;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array : ");
		size = s.nextInt();
	
		int [] a  = new int[size];
		
		System.out.println("Enter the elements in array : ");
		
		for(i=0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		 max = a[0];
		  for(i=1;i < a.length;i++)
		  {
		    if(a[i] > max)
		    {
		      max = a[i];
		    }
		  }
		  min = a[0];
		  for(i=1;i < a.length;i++)
		  {
		    if(a[i] < min)
		    {
		      min = a[i];
		    }
		  }
		System.out.println("Maximum no : "+ max +" Minimum no. : " + min);
	}
}
