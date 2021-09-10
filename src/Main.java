import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int studentAge = 15;
            double studentGPA = 3.45;
            String firstName = "Kayla";
            String lastName = "Hammon";
            char studentFirstInitial = firstName.charAt(0);
            char studentLastInitial = lastName.charAt(0);
            boolean hasPerfectAttendance = true;

            System.out.println(firstName + ' ' + lastName + " has a GPA of " + studentGPA);
            System.out.println("What do you want to update it to?");

            Scanner input = new Scanner(System.in);
            studentGPA = input.nextDouble();

            System.out.println(firstName + " " + lastName + " now has a GPA of " + studentGPA);
    }
}
