//Approach-1 || time complexity - O(log(n))
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

// Other way to find the number of digits..

// 1:- to convert whole integer into a string then find the length of the
// string, that is the count of the digits in a number.

/*
 * String num2 = Integer.toString(num);
 * return num2.length();
 */

// 2:- to use logarithmic way.

/*
 * int count = (int) (Math.floor(log10(n))+1);
 */