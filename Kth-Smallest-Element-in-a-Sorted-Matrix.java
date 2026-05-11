1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int a=0;
4        int arr[]=new int[matrix.length*matrix[0].length];
5        for(int i=0;i<matrix.length;i++){
6            for(int j=0;j<matrix[0].length;j++){
7                arr[a++]=matrix[i][j];
8            }
9        }
10        Arrays.sort(arr);
11        return arr[k-1];
12    }
13}