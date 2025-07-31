int removeElement(int* nums, int numsSize, int val) {
  int i,k=0,tmp;
  for(i=0;i<(numsSize-k);i++)
  {
    if(nums[i]==val)
    {
        tmp=nums[numsSize-k-1];
        nums[numsSize-k-1]=nums[i];
        nums[i]=tmp;
        k++;
        i--;
    }
  }
  return (numsSize-k);
}