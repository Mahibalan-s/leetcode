class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=1;
        int fl=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                fl=1;
                c++;
            }
            if(nums[i]!=0){
                n*=nums[i];
            }
        }
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && c==1){
                arr[i]=n;
            }
            else if(fl==1){
                arr[i]=0;
            }
            else{
                arr[i]=(n/nums[i]);
            }
        }
        return arr;
    }
}