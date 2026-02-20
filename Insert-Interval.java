1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> list=new ArrayList<>();
4        int n=intervals.length;
5        int i=0;
6        while(i<n){
7            if(intervals[i][1] < newInterval[0]){
8                list.add(intervals[i]);
9            }
10            else{
11                break;
12            }
13            i++;
14        }
15        while(i<n && intervals[i][0]<=newInterval[1]){
16            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
17            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
18            i++;
19        }
20        list.add(newInterval);
21        while(i<n){
22            list.add(intervals[i]);
23            i++;
24        }
25        return list.toArray(new int[list.size()][]);
26    }
27}