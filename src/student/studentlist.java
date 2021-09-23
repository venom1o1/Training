package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentlist {

	public static void main(String[] args) {
			
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the number of students : ");
		int no_students = s.nextInt();
		List<Student> student = new ArrayList<Student>();
		for(int i =0;i<no_students;i++)
		{
			System.out.println("Enter name of student : ");
			String name = s.next();
			System.out.println("Enter score of student : ");
			int score = s.nextInt();
			Student stude = new Student();
			stude.setname(name);
			stude.setscore(score);
			student.add(stude);
		}
		for(Student L: student)
		{
			System.out.println(L.getName()+", "+L.getscore());
		}

	}

}
