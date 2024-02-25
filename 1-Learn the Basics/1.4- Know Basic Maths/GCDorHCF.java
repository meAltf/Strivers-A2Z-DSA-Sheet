public class Solution {
    public static int calcGCD(int n, int m) {
        // Write your code here.
        int current = 1;
        int ans = 0;
        int minValue = Math.min(n, m);
        while (current <= minValue) {
            if (n % current == 0 && m % current == 0) {
                current++;
                ans = current - 1;
            } else {
                current++;
            }

        }
        return ans;
    }
}