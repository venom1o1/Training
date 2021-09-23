package train2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ALfunc {

	public static void main(String[] args) 
	{
		ArrayList<Integer> first = new ArrayList<>();
		
		first.add(50);
		first.add(20);
		first.add(10);
		first.add(30);
		first.add(70);
		
		System.out.println("ArrayList -> "+first);
		first.remove(2);
		System.out.println("After remove -> "+first);
		
		Collections.sort(first);
		System.out.println("after sort ->"+ first);
		
		
	}

}
