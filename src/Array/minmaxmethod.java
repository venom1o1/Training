package Array;

import java.util.Arrays;
import java.util.Scanner;

public class minmaxmethod {

	public static void main(String[] args) 
	{
		int size , i , min,max;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		size = s.nextInt();
		int [] a = new int[size];
		System.out.println("Enter array elements : ");
		
		for(i=0; i<size;i++)
		{
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		min=a[0];
		max=a[size-1];
		System.out.println("smallest element = "+ min + " largest element = " + max);
	}
}
