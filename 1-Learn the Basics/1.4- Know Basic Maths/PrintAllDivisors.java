import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<Integer> printDivisors(int n) {
        // Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) { // O(sqrt(n))
            if (n % i == 0) {
                ans.add(i);
                if ((n / i != i))
                    ans.add(n / i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}