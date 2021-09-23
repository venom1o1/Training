package train;

public class SalaryBased extends Teacher
{
	int salary;

	public SalaryBased(int tid, String tname, long phn, int salary) {
		super(tid, tname, phn);
		this.salary = salary;
	}
	
	void salary()
	{
		System.out.println("Teacher SalaryBased salary: "+salary);
	}
}
