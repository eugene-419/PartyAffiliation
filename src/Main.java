import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String partyAfil = "";

        // Ask the user to enter their party affiliation
        // Convert the input to uppercase
        // If D, display Democratic Donkey
        // If R, display Republican Elephant
        // If I, display Anonymous Mask
        // Otherwise, display an Other message

        System.out.print("Enter your Party (D, R, I): ");

        partyAfil = in.nextLine();
        partyAfil = partyAfil.toUpperCase();

        if (partyAfil.equals("D")) {
            System.out.println("You get a Democratic Donkey!");
        } else if (partyAfil.equals("R")) {
            System.out.println("You get a Republican Elephant!");
        } else if (partyAfil.equals("I")) {
            System.out.println("You get an Anonymous Mask!");
        } else {
            System.out.println("Not sure what " + partyAfil + " is!");
        }
    }
}