package Array;

import java.util.Scanner;

public class rem_element {

	public static void main(String[] args) 
	{
		int size , i ,j , index;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		size = s.nextInt();
		int [] a = new int[size];
		int [] b = new int[size-1];
		System.out.println("Enter array elements : ");
		
		for(i=0; i<size;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Enter the index to be removed : ");
		index = s.nextInt();
		
		for ( i = 0, j = 0; i < a.length; i++) 
		{
			    if (i == index) 
                {
                continue;
                }
			    b[j++] = a[i];
        }
		System.out.println("array after removing index " + index);
		
		for(i=0; i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}         
}
 