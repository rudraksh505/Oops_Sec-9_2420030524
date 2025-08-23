package proj7;


import java.time.LocalDate;


public class DateInfo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int currentyear = today.getYear();
		LocalDate endOfYear = LocalDate.of(currentyear, 12,31);
		
		int totalDaysinYear = today.lengthOfYear();
		int currentDayNumber = today.getDayOfYear();
        int daysRemaining = totalDaysinYear - currentDayNumber;
        

        System.out.println("Today's Date: " + today);
        System.out.println("Last Date of the Current Year: " + endOfYear);
        System.out.println("Days Remaining in the Year: " + daysRemaining);
		
	}

}
