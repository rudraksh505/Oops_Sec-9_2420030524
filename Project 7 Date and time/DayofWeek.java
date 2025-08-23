package proj7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (dd/mm/yyyy): ");
        String input = scanner.nextLine();

        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(input, inputFormat);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("EEEE");
        System.out.println(date.format(outputFormat));

        scanner.close();
    }
}
