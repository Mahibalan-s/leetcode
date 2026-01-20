1class Solution {
2    public int jump(int[] arr) {
3        if (arr.length <= 1)
4         return 0;
5
6        int jumps = 0;
7        int currentEnd = 0; 
8        int farthest = 0;   
9
10        for (int i = 0; i < arr.length - 1; i++) {
11            farthest = Math.max(farthest, i + arr[i]);
12            if (i == currentEnd) {
13                jumps++;
14                currentEnd = farthest; 
15                if (currentEnd >= arr.length - 1) 
16                break;
17            }
18        }
19        return jumps;
20    }
21}