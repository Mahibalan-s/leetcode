1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int m=0;
4        int t=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                t++;
8            }
9            else{
10                if(t>m){
11                    m=t;
12                }
13                t=0;
14            }
15        }
16        if(t>m){
17            m=t;
18        }
19        return m;
20    }
21}