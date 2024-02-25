import java.util.Scanner;
import java.util.*;

public class Main {
    private static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dupNum = num;
        int armNum = 0;
        int count = countDigits(dupNum);
        while (dupNum != 0) {
            int digit = dupNum % 10;
            armNum += Math.pow(digit, count);
            dupNum = dupNum / 10;
        }
        if (num == armNum)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
