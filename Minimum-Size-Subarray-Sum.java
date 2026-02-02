1import java.util.Arrays;
2
3class Solution {
4    public int minSubArrayLen(int target, int[] nums) {
5        // REMOVED: Arrays.sort(nums); <-- This was the culprit!
6        
7        int n = nums.length;
8        int minLen = Integer.MAX_VALUE;
9        int sum = 0;
10        int left = 0;
11
12        for (int right = 0; right < n; right++) {
13            // 1. Expand the window by adding the current number
14            sum += nums[right];
15
16            // 2. While the window meets the condition, try to shrink it
17            while (sum >= target) {
18                minLen = Math.min(minLen, right - left + 1);
19                
20                // Shrink from the left to see if we can find a smaller window
21                sum -= nums[left];
22                left++;
23            }
24        }
25
26        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
27    }
28}