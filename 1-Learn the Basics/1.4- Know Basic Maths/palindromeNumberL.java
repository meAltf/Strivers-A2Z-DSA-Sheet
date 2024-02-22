class Solution {
    public boolean isPalindrome(int x) {
        int actualNum = Math.abs(x);
        int revNum = 0;
        while (actualNum != 0) {
            int digit = actualNum % 10;
            revNum = revNum * 10 + digit;
            actualNum /= 10;
        }
        return (x == revNum) ? true : false;
    }
}