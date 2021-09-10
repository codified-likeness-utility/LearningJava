import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question = "What ingredients do you need to make artisanal sourdough bread?";
        String choiceOne = "a. water, flour, yeast, sugar, eggs, salt";
        String choiceTwo = "b. water, flour, salt";
        String choiceThree = "c. water, flour, yeast, salt";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        System.out.println("Please enter the corresponding letter for you answer...");

        // Retrieve the user's input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct, and we want to print out a congrats message to user
        if (input.charAt(0) == correctAnswer.charAt(0)) {
            System.out.println("Congratulations, you are correct!");

            // If the user's input does not match the correctAnswer...
            // then the user is incorrect, and we want to print out a message saying the user is incorrect
            // and what the correct choice is...
        } else {
            System.out.println("Incorrect answer.  The correct answer is option 'b' ");
        }




    }
}
