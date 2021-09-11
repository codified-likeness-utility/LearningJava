import java.util.Scanner;

public class Main {

    public static void calculateSalary(double weeklyRate, double vacationPay) {
        if (vacationPay > 0) {
            System.out.println(weeklyRate * 52 + vacationPay);
        } else {
            System.out.println(weeklyRate * 52);
        }
    }

    public static void main(String[] args) {
        // Input 1 = number of hours the employee works per week
        System.out.println("Please input the total amount of hours you work per week:");
        Scanner inputHours = new Scanner(System.in);
        double hoursWorkedPerWeek = inputHours.nextInt();

        // Input 2 = amount of money the employee makes per hour
        System.out.println("Please input your hourly wage:");
        Scanner inputWage = new Scanner(System.in);
        double hourlyWage = inputWage.nextInt();

        // Output = employee's gross annual salary
        double weeklyPay = hoursWorkedPerWeek * hourlyWage;

        System.out.println("How many days of paid vacation do you get per year?");
        Scanner vacationDays = new Scanner(System.in);
        double totalVacation = vacationDays.nextInt();
        double vacationPay = totalVacation * 8 * hourlyWage;

        calculateSalary(weeklyPay, vacationPay);
        // Bonus =  Add input that accounts for vacation days, where 1 vacation day = 8 hours of work

    }

}
