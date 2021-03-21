
import java.time.*;


public class DateDifference {

	public static void main(String[] args) {
		
		LocalDate start_Date= LocalDate.of(2020, 03, 18);
		
		LocalDate end_Date= LocalDate.now();
		findDifference(start_Date,end_Date);
				

	}
	private static void findDifference(LocalDate start_date,LocalDate end_date)
	{
		Period diff= Period.between(start_date, end_date);
		
		System.out.printf("Difference between two dates is : %d years,%d months and %d days",diff.getYears(),diff.getMonths(),diff.getDays());
	}

}
