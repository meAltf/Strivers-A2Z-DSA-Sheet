public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        double result = 0;
        switch (ch) {
            case 1:
                result = 3.14 * a[0] * a[0];
            case 2:
                if (a.length >= 2)
                    result = a[0] * a[1];
        }
        return result;
    }
}