class Solution {
    public int hIndex(int[] arr) {
        if(arr.length==1 && arr[0]>0){
            return 1;
        }
        Arrays.sort(arr);
        for(int i=0;(i<arr.length/2);i++){
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-i-1]=t;
        }
        int p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<i+1){
                return i;
            }
            p=i;
        }
        return p+1;
    }
}