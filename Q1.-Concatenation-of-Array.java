1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int arr[]=new int [nums.length*2];
4        for(int i=0;i<nums.length;i++){
5            arr[i]=nums[i];
6            arr[i+nums.length]=nums[i];
7        }
8        return arr;
9    }
10}