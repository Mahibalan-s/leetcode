1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        Map<Integer,Integer> hm=new HashMap<>();
4        List<Integer> list=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(hm.containsKey(nums[i])){
7                list.add(nums[i]);
8            }
9            else{
10                hm.put(nums[i],1);
11            }
12        }
13        return list;
14    }
15}