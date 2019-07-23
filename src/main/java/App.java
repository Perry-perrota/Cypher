import models.*;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Kindly input a word");
            String word = input.nextLine();
            System.out.println("Select one of the following");
            System.out.println("1:Encode");
            System.out.println("2.Decode");
            String choice = input.nextLine();
            int choiceInput = Integer.parseInt(choice);


            if (choiceInput == 1) {
                Encode newTry = new Encode(word);
                String encodedWord = newTry.EncodeWord(word);
                System.out.println("Your Encrypted word is:" +encodedWord);
                System.out.println("Your word was:" +word);

            } else if (choiceInput == 2) {
                Decode newTry = new Decode(word);
                String decodedWord = newTry.DecodeWord(word);
                System.out.println("Your Decrypted word is:" +decodedWord);
                System.out.println("Your word was:" +word);

            } else {
                running = false;
            }


        }
    }
}
