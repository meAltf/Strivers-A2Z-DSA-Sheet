public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        char printChar = 'A';
        for (int i = 0; i < n; i++) {
            // for character printing
            for (int j = 0; j <= i; j++) {
                System.out.print(printChar + " ");
            }
            printChar++;
            System.out.println();
        }
    }
}