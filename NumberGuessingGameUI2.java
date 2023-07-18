import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGameUI2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int minNumber = 1;
        int maxNumber = 50;
        int maxTries = 6;
        int randomNumber = rand.nextInt(maxNumber - minNumber + 1) + minNumber;
        int tryCount = 0;
        
        String message = "Guess the number between " + minNumber + " and " + maxNumber + " in " + maxTries + " tries.";
        int playerGuess = 0;
        while (tryCount < maxTries) {
            String input = JOptionPane.showInputDialog(null, message);
            if (input == null) {
                break;
            }
            try {
                playerGuess = Integer.parseInt(input);
                if (playerGuess < minNumber || playerGuess > maxNumber) {
                    throw new Exception("Please guess a number between " + minNumber + " and " + maxNumber);
                }
                tryCount++;
                if (playerGuess == randomNumber) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You won in " + tryCount + " tries!");
                    break;
                } else if (playerGuess < randomNumber) {
                    message = "Nope! The number you guessed is higher. Tries left: " + (maxTries - tryCount);
                } else {
                    message = "Nope! The number  you guessed is lower. Tries left: " + (maxTries - tryCount);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if (tryCount == maxTries) {
            JOptionPane.showMessageDialog(null, "Sorry, Maximum tries are over, The number was " + randomNumber + ".");
        }
    }
}
