package train;

public abstract class Teacher 
{
	int Tid;
	String Tname;
	long phn ;
	abstract void salary();
	
	public Teacher(int tid, String tname, long phn) 
	{
		Tid = tid;
		Tname = tname;
		this.phn = phn;
	}
	
	public void DisplayInfo()
	{
		System.out.println("Techear ID: " + Tid );
		System.out.println("Techear Name : " + Tname );
		System.out.println("Techear Phone: " + phn );
	}
	
	
}
