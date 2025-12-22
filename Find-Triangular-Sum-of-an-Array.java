1class Solution {
2    public int triangularSum(int[] nums) {
3        int n=nums.length;
4        while (n > 1) {
5            int[] nextRow = new int[n - 1];
6            for (int j = 0; j < n - 1; j++) {
7                nextRow[j] = (nums[j] + nums[j + 1]) % 10;
8            }
9            nums = nextRow; 
10            n--;
11        }
12    return nums[0];
13    }
14}