package train;

public class HourlyBased extends Teacher
{
		int rate_per_hour, hrs;

		public HourlyBased(int tid, String tname, long phn, int rate_per_hour, int hrs) {
			super(tid, tname, phn);
			this.rate_per_hour = rate_per_hour;
			this.hrs = hrs;
		}
		
		void salary()
		{
			System.out.println("Teacher Hourly Salary = " + (rate_per_hour*hrs));
		}		
		
}
