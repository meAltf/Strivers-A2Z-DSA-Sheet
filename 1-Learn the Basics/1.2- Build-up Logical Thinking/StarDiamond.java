public class Solution {

    // 1st part
    private static void nStarTriangle(int n) {
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
            System.out.println();
        }
    }

    // 2nd part
    private static void nStarReverseTriangle(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {
            // for starting of the space
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            // for star printing
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // for ending of the space
            for (int x = 0; x < i; x++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nStarDiamond(int n) {
        // Write your code here
        nStarTriangle(n);
        nStarReverseTriangle(n);
    }
}