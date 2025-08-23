package proj7;


	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;

	public class addDays {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter date (dd/mm/yyyy): ");
	        String input = scanner.nextLine();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate originalDate = LocalDate.parse(input, formatter);

	        LocalDate futureDate = originalDate.plusDays(30);
	        LocalDate pastDate = originalDate.minusDays(60);

	        System.out.println("Date after adding 30 days: " + futureDate);
	        System.out.println("Date after subtracting 60 days: " + pastDate);

	        scanner.close();
	    }
	}

