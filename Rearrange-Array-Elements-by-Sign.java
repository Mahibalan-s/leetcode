1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int arr[]=new int[nums.length];
4        int p=0;
5        int n=1;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i]>0){
8                arr[p]=nums[i];
9                p+=2;
10            }
11            else{
12                arr[n]=nums[i];
13                n+=2;
14            }
15        }
16        return arr;
17    }
18}