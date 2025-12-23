1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        for(int i=0;i<arr.length;i++){
4            for(int j=i+1;j<arr.length;j++){
5                if(arr[i]==arr[j]*2){
6                    return true;
7                }
8                else if(arr[j]==arr[i]*2){
9                    return true;
10                }
11            }
12        }
13        return false;
14    }
15}