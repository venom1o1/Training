package train2;

import java.util.HashMap;

class emp{
	int id ;
	String name;
	public emp(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
class dep{
	int deptid;
	String deptname;
	
	
}
	
}

public class details3HS {
	public static void main(String[] args) 
	{
		HashMap<emp,dep> office = new HashMap<>();
		office.put(new emp(1,"Neeraj"), new dep(1,"IT"));
		office.put(new emp(2,"rahul"), new dep(2,"HR"));
		office.put(new emp(3,"Dhruv"), new dep(3,"sales"));
		
		for(Entry<emp, dep>m,office.entrySet())
		{
			System.out.println(m.getkey());
			System.out.println();
			
		}
	}
	
}
