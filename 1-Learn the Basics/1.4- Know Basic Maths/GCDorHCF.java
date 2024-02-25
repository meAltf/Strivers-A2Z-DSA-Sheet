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

    // Using Recursion
    /*
     * Using Euclidean’s theorem:-
     * Intuition:
     * Gcd is the greatest number which is divided by both a and b.If a number is
     * divided by both a and b,
     * it is should be divided by (a-b) and b as well.
     */
    public static int calcGCD(int n, int m) {
        if(m==0) return n;
        return calcGCD(m, n%m);
}