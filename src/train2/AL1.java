package train2;

import java.util.Scanner;
import java.util.*;


public class AL1 {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		List<String> a= new ArrayList<>();
		a.add("red");
		a.add("blue");
		a.add("orange");
		a.add("yellow");
		
		System.out.println("Arraylist -> "+a);
		
		System.out.println("Enter position :");
		int pos = s.nextInt();
		
		System.out.println("Enter value :");
		String new1 = s.next();
		
		a.add(pos, new1);
		
		for(String str:a)
		System.out.println(str);
	}
}
