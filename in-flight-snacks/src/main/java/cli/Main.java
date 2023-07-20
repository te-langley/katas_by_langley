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
     * The snacks offered to each seated passenger.
     */
    private static String[] snacksOffered = {"Pretzels", "Chips", "Mint"};

    //==============================================================================
    // MAIN METHOD
    //==============================================================================
    public static void main(String[] args) {
        System.out.println("IN-FLIGHT SNACKS");
        System.out.println("================================================================================");

        String[][] snacksServed = new String[numberOfRows][seats.length];

        // Uncomment this line to enter values while running.
        // Scanner input = new Scanner(System.in);

        System.out.println("ENTER PASSENGER SNACK CHOICES: ");
        System.out.println("================================================================================");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < seats.length; j++) {
                System.out.println("Seat " + (i + 1) + seats[j]);
                System.out.println("Choose snack: " + Arrays.toString(snacksOffered));
                // Uncomment this line to enter values while running.
                // String snackSelected = input.nextLine();
                String snackSelected = "X";
                snacksServed[i][j] = snackSelected;
            }
        }

        System.out.println("================================================================================");
        System.out.println("SNACKS CHOSEN: ");
        for (int i = 0; i < numberOfRows; i++) {
            System.out.print("Row " + (i + 1) + " ");
            for (int j = 0; j < seats.length; j++) {
                System.out.print(snacksServed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
