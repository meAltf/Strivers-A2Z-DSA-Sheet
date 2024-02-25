public class Solution {
    public static long reverseBits(long n) {
        // Write your code here
        int i = 0;
        long[] arr = new long[32];
        while (n != 0) {
            arr[i] = (long) (n % 2);
            n = n / 2;
            i++;
        }
        for (; i < 32; i++) {
            arr[i] = 0;
        }
        long ans = arr[31];
        long multiply = 2;
        for (int j = 30; j >= 0; j--) {
            ans = ans + (long) arr[j] * multiply;
            multiply = multiply * 2;
        }
        return ans;
    }
}
