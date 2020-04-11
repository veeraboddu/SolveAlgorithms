package veera.practice;

import java.time.LocalDate;
import java.time.Period;

public class DateDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate endofCentury = LocalDate.of(2014, 01, 01);
		LocalDate now = LocalDate.now();
		 
		Period diff = Period.between(endofCentury, now);
		 
		System.out.printf("Difference is %d years, %d months and %d days old", 
		                    diff.getYears(), diff.getMonths(), diff.getDays());

	}

}
