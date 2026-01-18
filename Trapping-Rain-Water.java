1class Solution {
2    public int trap(int[] height) {
3        if (height == null || height.length == 0) return 0;
4        
5        int l = 0, r = height.length - 1;
6        int leftMax = 0, rightMax = 0;
7        int totalWater = 0;
8        
9        while (l < r) {
10            if (height[l] < height[r]) {
11                if (height[l] >= leftMax) {
12                    leftMax = height[l];
13                } else {
14                    totalWater += leftMax - height[l]; 
15                }
16                l++;
17            } else {
18                if (height[r] >= rightMax) {
19                    rightMax = height[r];
20                } else {
21                    totalWater += rightMax - height[r]; 
22                }
23                r--;
24            }
25        }
26        
27        return totalWater;
28    }
29}