// Last updated: 7/30/2026, 11:57:38 PM
1import java.util.HashMap;
2
3class Solution {
4
5    public int[] twoSum(int[] nums, int target) {
6
7        HashMap<Integer, Integer> map = new HashMap<>();
8
9        for (int i = 0; i < nums.length; i++) {
10
11            int complement = target - nums[i];
12
13            if (map.containsKey(complement)) {
14                return new int[]{map.get(complement), i};
15            }
16
17            map.put(nums[i], i);
18        }
19
20        return new int[]{};
21    }
22}