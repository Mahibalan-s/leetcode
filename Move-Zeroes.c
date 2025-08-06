void moveZeroes(int* nums, int n) {
    int i=0;
    int j=0;
    int c=0;
    while(i<n){
        if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
        }
        else{
            c++;
        }
        i++;
    }
    for(int d=n-c;d<n;d++){
        nums[d]=0;
    }

}