public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            // for starting numberCrown
            int num1 = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num1 + " ");
                num1++;
            }
            // for spaces
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print("    ");
            }
            // for second numberCrown
            int num2 = i + 1;
            for (int x = 0; x <= i; x++) {
                System.out.print(num2 + " ");
                num2--;
            }
            System.out.println();
        }
    }
}
// Updated one--