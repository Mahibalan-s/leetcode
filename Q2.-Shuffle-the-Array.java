1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int arr[] = new int[nums.length];
4        int t=0;
5        for(int i=0;i<n;i++){
6            arr[t++]=nums[i];
7            arr[t++]=nums[i+n];
8        }
9        return arr;
10    }
11}