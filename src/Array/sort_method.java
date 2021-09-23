package Array;

import java.util.Scanner;
import java.util.Arrays;

public class sort_method {

	public static void main(String[] args) {
		int size , i ;
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
		System.out.println("Sorted Array : ");
		for(i=0; i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
