import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static void printHelper(List<String> ans, int num, int i) {
        if (i > num)
            return;

        ans.add("Coding Ninjas");
        printHelper(ans, num, i + 1);
    }

    public static List<String> printNtimes(int n) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        printHelper(ans, n, 1);
        return ans;
    }
}