// Last updated: 8/5/2026, 10:31:56 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (nums[i] != 0) {
7                int temp = nums[i];
8                nums[i] = nums[j];
9                nums[j] = temp;
10                j++;
11            }
12        }
13    }
14}