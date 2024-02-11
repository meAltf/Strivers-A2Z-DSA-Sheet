import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int evenSum = 0, oddSum = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            num = num / 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
