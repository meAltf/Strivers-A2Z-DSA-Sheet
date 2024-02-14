public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = n; j > i; j--) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}