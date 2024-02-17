public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            char printChar = 'A';
            // for character printing
            for (char ch = 'A'; ch < 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            /*
             * 
             * for (int j = 0; j < n - i; j++) {
             * System.out.print(printChar + " ");
             * printChar++;
             * }
             * 
             */
            // for spaces
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
