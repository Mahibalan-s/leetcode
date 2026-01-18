1class Solution {
2    public int trap(int[] arr) {
3        if (arr == null || arr.length < 3) return 0;
4
5        int sum = 0;
6        
7        int peakIndex = 0;
8        for (int i = 0; i < arr.length; i++) {
9            if (arr[i] > arr[peakIndex]) {
10                peakIndex = i;
11            }
12        }
13        int l = 0;
14        int sub = 0;
15        int w = 0;
16        for (int r = 0; r <= peakIndex; r++) {
17            if (arr[r] >= arr[l]) {
18                sum += (arr[l] * w) - sub;
19                l = r;
20                w = 0;
21                sub = 0;
22            } else {
23                sub += arr[r];
24                w++;
25            }
26        }
27        int rWall = arr.length - 1;
28        sub = 0;
29        w = 0;
30        for (int i = arr.length - 1; i >= peakIndex; i--) {
31            if (arr[i] >= arr[rWall]) {
32                sum += (arr[rWall] * w) - sub;
33                rWall = i;
34                w = 0;
35                sub = 0;
36            } else {
37                sub += arr[i];
38                w++;
39            }
40        }
41
42        return sum;
43    }
44}