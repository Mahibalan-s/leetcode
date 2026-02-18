1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        Map <Integer,Integer> hm=new HashMap<>();
4        List<Integer> list=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(!hm.containsKey(nums[i])){
7                hm.put(nums[i],1);
8            }
9            else{
10                hm.put(nums[i],hm.get(nums[i])+1);
11            }
12        }
13        for(int i=0;i<nums.length;i++){
14            if(hm.get(nums[i])>nums.length/3){
15                if(!list.contains(nums[i])){
16                    list.add(nums[i]);
17                }
18            }
19        }
20        return list;
21    }
22}