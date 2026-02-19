1class Solution {
2    public int findMinArrowShots(int[][] points) {
3        if(points.length==1){
4            return 1;
5        }
6        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
7        int c=points[0][1];
8        int a=1;
9        for(int i=1;i<points.length;i++){
10            if(points[i][0]>c){
11                a++;
12                c=points[i][1];
13            }
14        }
15        return a;
16    }
17}