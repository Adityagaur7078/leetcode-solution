// Last updated: 7/31/2026, 11:10:33 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}