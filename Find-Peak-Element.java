1class Solution {
2    public int findPeakElement(int[] nums) {
3        if(nums.length==1){
4            return 0;
5        }
6        int l=nums.length/2;
7        int i=0;
8        while(i<l){
9            if(i==0 && nums[i+1]<nums[i]){
10                return i;
11            }
12            else if(i>0 && nums[i-1]<nums[i] && nums[i+1]<nums[i]){
13                return i;
14            }
15            i++;
16        }
17        int j=l;
18        while(j<nums.length){
19            if(j==nums.length-1 && nums[j-1]<nums[j]){
20                return j;
21            }
22            else if(nums[j]>nums[j-1] && nums[j]>nums[j+1]){
23                return j;
24            }
25            j++;
26        }
27        return 0;
28    }
29}