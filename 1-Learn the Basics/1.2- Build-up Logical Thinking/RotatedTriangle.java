public class Solution {
    // for 1st part of the pattern
    private static void firstPartPattern(int n) {
        for (int i = 0; i < n; i++) {
            // for stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // for 2nd part of the pattern
    private static void secondPartPattern(int n) {
        for (int i = 0; i < n; i++) {
            // for stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nStarTriangle(int n) {
        // Write your code here
        firstPartPattern(n);
        secondPartPattern(n);
    }
}