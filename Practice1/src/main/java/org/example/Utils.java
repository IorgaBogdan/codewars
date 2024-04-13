package org.example;

public class Utils {
    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    /**
     * Converts a number into a String
     *
     * @param num unconverted number
     * @return converted String
     */
    public static String numberToString(int num) {
        return Integer.toString(num);
    }
}

