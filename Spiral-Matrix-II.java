1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] arr=new int[n][n];
4        int l=0;
5        int r=n-1;
6        int t=0;
7        int b=n-1;
8        int d=1;
9        while(l<n && t<n){
10            for(int i=l;i<=r;i++){
11                arr[t][i]=d++;
12            }
13            t++;
14            for(int i=t;i<=b;i++){
15                arr[i][r]=d++;
16            }
17            r--;
18            for(int i=r;i>=l;i--){
19                arr[b][i]=d++;
20            }
21            b--;
22            for(int i=b;i>=t;i--){
23                arr[i][l]=d++;
24            }
25            l++;
26        }
27        return arr;
28    }
29}