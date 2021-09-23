package train2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class detailsHSAL {

	public static void main(String[] args) 
	{
		HashMap<Integer, ArrayList<String>> entries = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> first =  new ArrayList<String>();
		first.add("Dogs");
		first.add("Cats");
		
		ArrayList<String> second = new ArrayList<String>();
		second.add("Snails");
		second.add("Fishes");
		entries.put(1,first);
		entries.put(2,second);
		
		for(Entry<Integer, ArrayList<String>> ent : entries.entrySet())
		{
			int key = ent.getKey();
			ArrayList<String> value = ent.getValue();
			System.out.println(key+" "+value);
			for(String refer : value)
			{
				System.out.println(refer);
			}
		}
		
		
	}

}
