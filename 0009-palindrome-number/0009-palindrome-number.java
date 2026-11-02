class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int d = 0;
        int original = x;
        
        while(x > 0) {
            int digit = x % 10;

            d = d * 10 + digit;

            x = x / 10;
        }

        if (original == d) {
            return true;
        }

        return false;

    }
}