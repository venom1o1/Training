package train2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Detailed {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> entries = new HashMap<Integer, String>();
		entries.put(1,"Apples");
		entries.put(2, "Bananas");
		Set<Entry<Integer, String>> set = entries.entrySet();
		for(Map.Entry<Integer, String>S:set)
		{
			System.out.println(S.getKey()+" "+S.getValue());
		}
		Set<Integer> h=entries.keySet();
		for(int i:h)
		{
			System.out.println(i+" "+entries.get(i));
		}
				
	}

}
