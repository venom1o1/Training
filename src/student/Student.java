package student;

public class Student
{
		private String name;
		private int score;
		
		Student()
		{
			
		}
		public Student(String name, int score) {
			
			this.name = name;
			this.score = score;
		}
		public String getName()
		{
			return name;
		}
		public void  setname(String name) 
		{
			this.name=name;
		}
		public int getscore() {
			return score;
		}
		public void setscore(int score) 
		{
			this.score=score;
		}
	
		
		
}
