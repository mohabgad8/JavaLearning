package basics;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        
        System.out.println("How many hours did you work ?");
        int hours;
        double rate;
        try (Scanner scanner = new Scanner(System.in)) {
            hours = scanner.nextInt();
            System.out.println("What is your hourly pay rate ?");
            rate = scanner.nextDouble();
        }

        double payRate = hours * rate;

        System.out.println("Gross pay: " + payRate);
    }
}
