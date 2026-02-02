1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int c=Integer.MAX_VALUE;
4        int i=0;
5        int j=0;
6        int sum=nums[i];
7        while(j<nums.length && i<nums.length){
8            if(nums[i]>=target){
9                return 1;
10            }
11            else if(nums[j]>=target){
12                return 1;
13            }
14            else if(sum<target){
15                if(j+1>=nums.length){
16                    break;
17                }
18                sum+=nums[++j];
19            }
20            if(sum>=target){
21                c=Math.min(j-i+1,c);
22                sum-=nums[i++];
23            }
24        }
25        if(c==Integer.MAX_VALUE){
26            return 0;
27        }
28        return c;
29    }
30}