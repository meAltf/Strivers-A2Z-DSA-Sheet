public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            char printChar = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(printChar + " ");
                printChar++;
            }
            System.out.println();
        }
    }
}
// updated with character..
