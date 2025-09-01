class Solution {
    public int missingNumber(int[] nums) {
        int s=nums.length;
        s=(s*(s+1))/2;
        int f=0;
        for(int i=0;i<nums.length;i++){
            f+=nums[i];
        }
        return s-f;

    }
}