1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        int s=nums[0]+nums[1]+nums[2];
4        int min=Integer.MAX_VALUE;
5        Arrays.sort(nums);
6        for(int i=0;i<nums.length-2;i++){
7            int l=i+1;
8            int r=nums.length-1;
9            while(l<r){
10                int c=nums[i]+nums[l]+nums[r];
11                if(c==target){
12                    return c;
13                }
14                if(Math.abs(c-target) < Math.abs(s-target)){
15                    s=c;
16                }
17                if(c>target){
18                    r--;
19                }
20                else{
21                    l++;
22                }
23            }
24        }
25        return s;
26    }
27}