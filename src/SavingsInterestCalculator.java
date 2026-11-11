import java.util.Scanner;

public class SavingsInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter deposit amount (whole number): ");
        int deposit = input.nextInt();

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        double rate = 8.0;
        double interest = deposit * rate * years / 100;

        long roundedInterest = Math.round(interest);
        int cutInterest = (int) interest;
        double twoDecimals = Math.round(interest * 100) / 100.0;

        System.out.println();
        System.out.println("===== SUMMARY REPORT =====");
        System.out.println("Customer: " + name);
        System.out.println("Deposit: " + deposit);
        System.out.println("Years: " + years);
        System.out.println("Exact interest: " + interest);
        System.out.println("Rounded interest (for management): " + roundedInterest);
        System.out.println("Interest after (int) cast: " + cutInterest);

        System.out.println();
        System.out.println("===== TYPE CONVERSION =====");

        double depositAsDouble = deposit;
        System.out.println("Automatic (safe): int " + deposit + " becomes double " + depositAsDouble);

        int a = 7;
        int b = 2;
        System.out.println("Integer division 7 / 2 = " + (a / b));
        System.out.println("With (double) cast 7 / 2 = " + ((double) a / b));

        System.out.println("Manual cast needed: double " + interest + " to int " + cutInterest);
        System.out.println("The decimal part was lost, so accuracy is affected.");
        input.close();
    }
}