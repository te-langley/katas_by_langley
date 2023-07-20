package cli;

import java.util.Arrays;

/**
 * This class provides the main method and hence drives the in-flight snacks
 * command-line application.
 */
public class Main {
    //==============================================================================
    // GLOBAL VARIABLES
    //==============================================================================
    /**
     * Represents the number of rows of seats on the plane.
     */
    private static int numberOfRows = 20;
    /**
     * Represents the individual seats in a row.
     */
    private static char[] seats = {'A', 'B', 'C', 'D', 'E', 'F'};
    /**
     * The snacks offered to each passenger.
     */
    private static String[] snacksOffered = {"Pretzels", "Chips", "Mint"};
    /**
     * The snacks selected by each passenger.
     */
    private static String[][] snacksServed = new String[numberOfRows][seats.length];

    //==============================================================================
    // MAIN METHOD
    //==============================================================================
    public static void main(String[] args) {
        System.out.println("IN-FLIGHT SNACKS");
        System.out.println("================================================================================");

        System.out.println("ENTER PASSENGER SNACK CHOICES: ");
        System.out.println("================================================================================");
        enterSnackChoices();

        System.out.println("================================================================================");
        System.out.println("SNACKS CHOSEN: ");
        showSnackChoices();
        
        System.out.println("================================================================================");
    }

    /**
     * Prompts the user to enter a snack selection for each seat and saves it to
     * the {@code snacksServed} array.
     *
     * @param snacksServed
     */
    private static void enterSnackChoices() {
        // Uncomment this line to enter values while running.
        // Scanner input = new Scanner(System.in);
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < seats.length; j++) {
                System.out.print("Seat " + (i + 1) + seats[j] + " choice ");
                System.out.println(Arrays.toString(snacksOffered) + ": ");
                // Uncomment this line to enter values while running.
                // String snackSelected = input.nextLine();
                // Comment this line to enter values while running.
                String snackSelected = "X";
                snacksServed[i][j] = snackSelected;
            }
            System.out.println("--------------------------------------------------------------------------------");
        }
    }

    private static void showSnackChoices() {
        for (int i = 0; i < numberOfRows; i++) {
            System.out.print("Row " + (i + 1) + " ");
            for (int j = 0; j < seats.length; j++) {
                System.out.print(snacksServed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
