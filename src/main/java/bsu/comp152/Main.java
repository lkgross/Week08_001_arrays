package bsu.comp152;

public class Main {

    public static void main(String[] args) {
        /*
         * Inline initialization of an array with prescribed elements.
         */
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        /*
         * We can declare and define arrays with default values.
         */
        /*
         * names is an array of 1000 values of null (the default object--- Strings are objects in Java)
         */
        String[] names = new String[1000];
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
         * Directly printing an array (object in Java) gives memory address.
         */
        System.out.println(SUITS);
        /*
         * We can process arrays by looping through arrays index-by-index.
         */
        for (int i = 0; i < SUITS.length; i++){
            System.out.println(SUITS[i]);
        }
        for (int i = 0; i < booleanArray.length; i++){
            System.out.println(booleanArray[i]);
        }
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        /*
         * We can process arrays by looping through arrays element-by-element.
         */
        for (String suit : SUITS){
            System.out.println(suit);
        }
    }
}