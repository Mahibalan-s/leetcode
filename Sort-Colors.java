1class Solution {
2    public void sortColors(int[] nums) {
3        int arr[]=new int[nums.length];
4        Map<Integer,Integer> hm=new HashMap<>();
5        for(int i=0;i<nums.length;i++){
6            if(hm.containsKey(nums[i])){
7                hm.put(nums[i],hm.get(nums[i])+1);
8            }
9            else{
10                hm.put(nums[i],1);
11            }
12        }
13        int k=0;
14        for(int i=0;i<3;i++){
15            if(hm.containsKey(i)){
16                int j=hm.get(i);
17                while(j>0){
18                    arr[k++]=i;
19                    j--;
20                }
21            }
22            else{
23                continue;
24            }
25            
26        }
27        System.arraycopy(arr,0,nums,0,arr.length);
28    }
29}