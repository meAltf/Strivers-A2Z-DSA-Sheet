import java.util.*;

public class Solution {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0, b = 1, c = 0;
        if (num == a || num == b)
            System.out.println(num);

        c = a + b;
        if (num > 2) {
            for (int i = 2; i < num; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            System.out.println(c);
        }
    }
}
