1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int arr[]=new int[2];
4        arr[0]=-1;
5        arr[1]=-1;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]==target && arr[0]==-1){
8                arr[0]=i;
9            }
10            else if(nums[i]==target){
11                arr[1]=i;
12            }
13        }
14        if(arr[1]==-1){
15            arr[1]=arr[0];
16        }
17        return arr;
18    }
19}