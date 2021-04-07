import java.util.*;

public class Main {

    public static void main(String args[]) {
        String question = "What is the coolest animal?";
        String choiceOne = "Goose";
        String choiceTwo = "Raccoon";
        String choiceThree = "Moose";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Please choose the correct answer." +"\nA."+ choiceOne +"\nB."+ choiceTwo  +"\nC."+ choiceThree
        );

        Scanner scanInput = new Scanner(System.in);
        // Have the user input an answer
        String userAnswer = scanInput.next();
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (userAnswer.equalsIgnoreCase(correctAnswer) || userAnswer.equalsIgnoreCase("B")){
            System.out.println ("Correct! "+ correctAnswer + "s" + " are the coolest animal");
        }
        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
            System.out.println ("Whoomp, whoomp. That's not right. You said " + userAnswer + " is the coolest animal."
            + "\nBut we all know that the " + correctAnswer + " is the coolest animal of all time.");
        }
    }

}
