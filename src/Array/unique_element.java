package Array;

import java.util.Scanner;

public class unique_element {

	public static void main(String[] args) {
		int size,i,j;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array : ");
		size = s.nextInt();
	
		int [] a  = new int[size];
		
		System.out.println("Enter the elements in array : ");
		
		for(i=0;i<size;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("Unique elements are : ");
		for ( i = 0; i < size; i++)
        {
            for (j = 0; j < i; j++)
            if(a[i] == a[j])
                break;
            if (i == j)
            System.out.print( a[i] + " ");
        }
	}

}
