public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        if (type.equals("Character"))
            return 1;
        else if (type.equals("Integer") || type.equals("Float"))
            return 4;
        else if (type.equals("Long") || type.equals("Double"))
            return 8;
        return -1;
    }
}