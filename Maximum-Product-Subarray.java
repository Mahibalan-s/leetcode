1class Solution {
2    public int maxProduct(int[] nums) {
3        if(nums.length==1){
4            return nums[0];
5        }
6        int max=Integer.MIN_VALUE;
7        int pp=0;
8        int sp=0;
9        int n=nums.length;
10        for(int i=0;i<n;i++){
11            if(pp==0){
12                pp=nums[i];
13            }
14            else{
15                pp=pp*nums[i];
16            }
17            if(sp==0){
18                sp=nums[n-i-1];
19            }
20            else{
21                sp=sp*(nums[n-i-1]);
22            }
23            max=Math.max(max,Math.max(pp,sp));
24        }
25        return max;
26    }
27}