import java.util.Scanner;

public class Solution {
    public static String isPrime(int num) {
        // Your code goes here
        if (num == 1)
            return "NO";
        int curr = 2;
        while (curr * curr <= num) {
            if (num % curr == 0)
                return "NO";
            curr++;
        }
        return "YES";
    }
}