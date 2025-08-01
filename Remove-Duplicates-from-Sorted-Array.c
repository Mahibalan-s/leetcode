int removeDuplicates(int* nums, int n) {
    int j=0;
    int i=1;
    if(n==0){
        return 0;
    }
    while(i<n){
        if(nums[i]!=nums[j]){
            nums[++j]=nums[i];
        }
        i++;
    }
    return ++j;
}