public class Solution {
    private static void printHelper(int[] arr, int num, int i) {
        if (num == 0)
            return;

        arr[i - 1] = num;
        printHelper(arr, num - 1, i + 1);
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        printHelper(arr, x, 1);
        return arr;
    }
}