package bsu.comp152;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /* Enable reading from a file.
         *
         */
        File myfile = new File("namesSection001");
        Scanner inputFile = new Scanner(myfile);
        /*
         * Inline initialization of an array with prescribed elements.
         * This array is designed to be constant, which is why it is named with all capital letters (SUITS).
         */
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        /*
         * We can declare and define arrays with default values.
         */
        /*
         * names is an array of 1000 values of null (the default object--- Strings are objects in Java)
         */
        String[] names = new String[100];
        /* While there's still data to read from the file, add the name to the names Array. While the file has a next piece of data, add the name to the names Array.
         */
        int j = 0;
        while (inputFile.hasNext()) {
            names[j] = inputFile.nextLine();
            j++;
        }
        /*
         * Arrays in Java are objects.
         * Arrays do NOT change size.
         */
        /*
         * numberArray is an array of 100 values of 0.0.
         */
        double[] numberArray = new double[100];
        /*
         * intArray is an array of 100 values of 0.
         */
        int[] intArray = new int[100];
        /*
         * booleanArray is an array of 100 values of false.
         */
        boolean[] booleanArray = new boolean[100];
        /*
         * We can access the length public field of an array.
         */
        System.out.println(SUITS.length);
        System.out.println(numberArray.length);
        /*
         * Directly printing an array (object in Java) gives its memory address.
         */
        System.out.println(SUITS);
        /*
         * We can process arrays by looping through arrays element-by-element.
         */
        for (String suit : SUITS) {
            System.out.println(suit);
        }
        /*
         * We can process arrays by looping through arrays index-by-index.
         */
        for (int i = 0; i < SUITS.length; i++) {
            System.out.println(SUITS[i]);
        }
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.println(booleanArray[i]);
        }

        System.out.println()
        ;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);
            }

        }
        int classSize = j;
        System.out.printf("Class size is %d", classSize);

        System.out.println();

        System.out.printf("Here is a question for %s", names[20]);

        int chosenIndex = 100;
        try {
            // Block of code to try
            System.out.printf("Here is a question for %s", names[chosenIndex]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            // Block of code to handle errors.
            System.out.println("The chosen index is out of bounds.");
        }

    }
}