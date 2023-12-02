public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        double result = 0.0;
        switch (ch) {
            case 1:
                result = Math.PI * a[0] * a[0];
                break;
            case 2:
                result = a[0] * a[1];
        }
        return result;
    }
}