public class Solution {
    private static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    public static int sumOfAllDivisors(int n) {
        // Write your code here.
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += sumOfDivisors(i);
        }
        return sum;
    }
}