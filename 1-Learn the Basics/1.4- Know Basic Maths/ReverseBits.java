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

// Approach-
/*
 * 1- initializes an array arr of size 32 to store the individual bits of the
 * number in reverse order.
 * 2- Iterates over the number n, taking its remainder when divided by 2 (n % 2)
 * and storing it in the array arr.
 * 3- It then divides n by 2 to shift its bits to the right (n / 2) and
 * increments the index i.
 * 4- Once all bits of n are extracted and stored in arr, it pads the rest of
 * the array with zeros if necessary to make it exactly 32 bits long.
 * 5- then constructs the reversed number by iterating over the array arr in
 * reverse order.
 * 6- Starting from the most significant bit (arr[31]), it multiplies each bit
 * by increasing powers of 2 and accumulates the result in the variable ans.
 */