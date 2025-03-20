class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int l=n/2;
        int m,max=0;
        m=0;
        int c=0;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c>m){
                max=nums[i];
                m=c;
            }
            c=0;
        }
        return max;
    }
}