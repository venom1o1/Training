package Array;


import java.util.Scanner;

public class sort {

	public static void main(String[] args) 
	{
		int size , i , j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in array : ");
		size = s.nextInt();
		int [] a = new int[size];
		System.out.println("Enter array elements : ");
		
		for(i=0; i<size;i++)
		{
			a[i] = s.nextInt();
		}
		for ( i = 0; i <a.length; i++) 
		{     
	          for ( j = i+1; j <a.length; j++) 
	          {     
	              if(a[i] >a[j]) 
	              {  int temp;
	                 temp = a[i];    
	                 a[i] = a[j];    
	                 a[j] = temp;    
	               }     
	            }     
	        }   
		System.out.println("Sorted Array : ");
		for(i=0; i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
