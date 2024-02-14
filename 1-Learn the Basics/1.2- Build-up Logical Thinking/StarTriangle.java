/**
 * Using 4 loops, printing * seperatly part wise
 */
public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            // for first-part of spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // for first-part of the star pattern
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            // for second-part of the star pattern
            for (int x = 0; x < i; x++) {
                System.out.print("*");
            }
            // for 2nd-part of space
            for (int y = 0; y < n - i - 1; y++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/**
 * using 3 loops only, printing * together row wise
 */
public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        // using 3 loop only, printing (*) row wise at once.
        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // For printing the stars in each row
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // For printing the spaces after the stars in each row
            for (int x = 0; x < n - i - 1; x++) {
                System.out.print(" ");
            }
            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();

        }
    }
}