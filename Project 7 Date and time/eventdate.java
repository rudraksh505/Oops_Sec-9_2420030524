package proj7;


	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.time.temporal.ChronoUnit;
	import java.util.Scanner;

	public class eventdate {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter event date (dd/mm/yyyy): ");
	        String input = scanner.nextLine();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate eventDate = LocalDate.parse(input, formatter);
	        LocalDate today = LocalDate.now();

	        long daysBetween = ChronoUnit.DAYS.between(today, eventDate);

	        if (daysBetween > 0) {
	            System.out.println(daysBetween + " days left until the event.");
	        } else if (daysBetween < 0) {
	            System.out.println("The event was " + Math.abs(daysBetween) + " days ago.");
	        } else {
	            System.out.println("The event is today!");
	        }

	        scanner.close();
	    }
	}

