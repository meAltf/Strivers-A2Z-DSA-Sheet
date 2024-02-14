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