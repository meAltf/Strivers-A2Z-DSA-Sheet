public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            // for spaces-1
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // for printing the character
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(ch + " ");
                if (k <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // for spaces-2
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}