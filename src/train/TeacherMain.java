package train;

import java.util.Scanner;

public class TeacherMain
{
	public static void main(String args[])
	{
		int Tid, rate, sal , hrs;
		String Tname;
		long phn;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Teacher ID :");
		Tid = s.nextInt();
		System.out.println("Enter Teacher name :");
		Tname = s.next();
		System.out.println("Enter Teacher phone no.: ");
		phn = s.nextLong();
		System.out.println("Enter Teacher rate per hour:");
		rate = s.nextInt();
		System.out.println("Enter number of hours:");
		hrs = s.nextInt();
		Teacher teacher = new HourlyBased(Tid, Tname, phn, rate, hrs);
		teacher.DisplayInfo();
		teacher.salary();
		
		System.out.println("Enter Teacher ID :");
		Tid = s.nextInt();
		System.out.println("Enter Teacher name :");
		Tname = s.next();
		System.out.println("Enter Teacher phone no.: ");
		phn = s.nextLong();
		System.out.println("Enter Teacher's Salary");
		sal = s.nextInt();
		Teacher teacher2 = new SalaryBased(Tid, Tname, phn, sal);
		teacher2.DisplayInfo();
		teacher2.salary();
		
	}
}
