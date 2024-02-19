//Approach-1
public class Solution {
    public static int countDigits(int n) {
        // Write your code here.
        int tempNum = n;
        int count = 0;
        while (tempNum != 0) {
            int digit = tempNum % 10;
            if (digit != 0 && n % digit == 0)
                count++;
            tempNum = tempNum / 10;
        }
        return count;
    }
}