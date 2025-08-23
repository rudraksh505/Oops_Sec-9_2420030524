package proj7;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class agecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Birthday: ");
        String input = sc.nextLine();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birthday = LocalDate.parse(input, format);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthday, today);

        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and "+ age.getDays() + " days old.");
        sc.close();
    }
}