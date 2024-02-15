public class Solution {
    // for even lines
    private static void printBinaryHelper(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                int num = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    if (num == 1)
                        num = 0;
                    else
                        num = 1;
                }
            } else {
                int num = 0;
                for (int k = 0; k <= i; k++) {
                    System.out.print(num + " ");
                    if (num == 0)
                        num = 1;
                    else
                        num = 0;
                }
            }
            System.out.println();
        }
    }

    public static void nBinaryTriangle(int n) {
        // Write your code here.
        printBinaryHelper(n);
    }
}