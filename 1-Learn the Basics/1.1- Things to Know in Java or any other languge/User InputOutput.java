import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Write your code here

        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        if (input >= 'A' && input <= 'Z')
            System.out.println(1);
        else if (input >= 'a' && input <= 'z')
            System.out.println(0);
        else
            System.out.println(-1);
    }
}