1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int arr[]=new int[nums.length];
4        int c=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]>0){
7                arr[c]=nums[i];
8                c+=2;
9            }
10        }
11        c=1;
12        for(int i=0;i<nums.length;i++){
13            if(nums[i]<0){
14                arr[c]=nums[i];
15                c+=2;
16            }
17        }
18        return arr;
19    }
20}