1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        
4        int[] smaller = new int[101];
5        for (int i = 0; i < nums.length; i++) {
6            smaller[nums[i]]++;
7        }
8        for (int i = 1; i < 101; i++) {
9            smaller[i] += smaller[i-1];
10        }
11        for (int i = 0; i < nums.length; i++) {
12            int position = nums[i];
13            if (position == 0) nums[i] = 0;
14            else {
15                nums[i] = smaller[position - 1];
16            }
17        }
18        return nums;
19    }
20}