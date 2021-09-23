package train2;

import java.util.ArrayList;
import java.util.Scanner;

public class notuniqueAL {

	public static void main(String[] args) 
	{
		ArrayList<Integer> Li = new ArrayList<>();
		Li.add(10);
		Li.add(20);
		Li.add(30);
		Li.add(10);
		System.out.println("Array list ->");
		for(Integer value :Li)
		{
			 System.out.print(value+ "  ");
		}
		
	}

}
