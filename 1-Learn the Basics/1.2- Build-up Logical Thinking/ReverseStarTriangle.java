public class Solution {
    public static void nStarReverseTriangle(int n) {
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
}