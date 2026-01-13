1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        int arr[]=new int[nums.length];
4        int m=0;
5        List <Integer> a=new ArrayList<>();
6        for(int i=0;i<nums.length;i++){
7            arr[nums[i]-1]++;
8            if(m<nums[i]){
9                m=nums[i];
10            }
11        }
12        for(int i=0;i<arr.length;i++){
13            if(arr[i]==0){
14                a.add(i+1);
15            }
16        }
17        return a;
18    }
19}