
import java.util.Scanner;
public class DebuggingLoop {
    public static void main(String[] args) {
        String userInput = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        userInput = keyboard.next();

        while (userInput.equalsIgnoreCase("stop") == false){
            System.out.println(userInput);
            break;
        }

    }
}

