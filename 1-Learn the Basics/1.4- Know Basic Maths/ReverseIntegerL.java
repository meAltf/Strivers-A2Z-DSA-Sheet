class Solution {
    private int countDigits(int number) {
        // this counting of digits failed in case of negative numbers
        String count = Integer.toString(number);
        return count.length();
        // we can use this one as well to count the digits of a number
        // return (int) (Math.floor(Math.log10((double) number)) + 1);
    }

    public int reverse(int x) {
        int num = Math.abs(x);
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            // condition to handled the Integer Overflown things..
            if (revNum > (Integer.MAX_VALUE - digit) / 10)
                return 0;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return (x < 0) ? -revNum : revNum;
    }
}