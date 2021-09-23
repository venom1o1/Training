package train2;

import java.util.ArrayList;
import java.util.Scanner;

public class copyAL {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> first= new ArrayList<>();
		
		first.add(10);
		first.add(20);
		first.add(30);
		first.add(40);
		
		ArrayList<Integer> second = new ArrayList<>();
		second.addAll(first);
		System.out.println("1st arraylist -> ");
		for (Integer value : first) 
		{
            System.out.print(value+ "  ");
        }
		second.add(60);
		System.out.println(" \n2nd arraylist -");
		for(Integer value : second)
		{
			System.out.print(value+ "  ");
		}
	}

}
