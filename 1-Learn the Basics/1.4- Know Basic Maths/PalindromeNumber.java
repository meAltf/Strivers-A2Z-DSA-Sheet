import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int actualNum = num;
        int revNum = 0;
        while (actualNum != 0) {
            int digit = actualNum % 10;
            revNum = revNum * 10 + digit;
            actualNum /= 10;
        }
        // return (actualNum==revNum) ? "true" : "false";
        if (num == revNum)
            System.out.println("true");
        else
            System.out.println("false");
    }
}