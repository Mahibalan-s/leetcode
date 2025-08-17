class Solution {
    public int[][] transpose(int[][] matrix) {

        int a=matrix.length;
        int b=matrix[0].length;
        int [][] arr=new int[b][a];
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
}