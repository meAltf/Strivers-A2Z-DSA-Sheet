public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {
            char printChar = (char) (int) ('A' + n - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(printChar + " ");
                printChar--;
            }
            System.out.println();
        }
    }
}