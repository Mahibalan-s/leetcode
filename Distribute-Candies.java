1class Solution {
2    public int distributeCandies(int[] arr) {
3        int n = arr.length/2;
4        int c=1;
5        Arrays.sort(arr);
6        int k=arr[0];
7        for(int i=0;i<arr.length;i++){
8            if(arr[i]!=k){
9                c++;
10                k=arr[i];
11            }
12        }
13        return (c>n)?n:c;
14    }
15}