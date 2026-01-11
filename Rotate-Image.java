1class Solution {
2    public void rotate(int[][] arr) {
3        for(int i=0;i<arr.length;i++){
4            for(int j=i+1;j<arr.length;j++){
5                int t=arr[j][i];
6                arr[j][i]=arr[i][j];
7                arr[i][j]=t;
8            }
9        }
10        for(int i=0;i<arr.length;i++){
11            int l=arr[0].length-1;
12            for(int j=0;j<arr[0].length/2;j++){
13                int t=arr[i][l];
14                arr[i][l--]=arr[i][j];
15                arr[i][j]=t;
16            }
17        }
18    }
19}