public class Solution {
    private static void printHelper(int[] arr, int num, int i) {
        if (i > num)
            return;

        arr[i - 1] = i;
        printHelper(arr, num, i + 1);
    }

    public static int[] printNos(int x) {
        int[] ans = new int[x];
        printHelper(ans, x, 1);
        return ans;
    }
}