1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        int n = image.length;
4        
5        for (int[] row : image) {
6            int left = 0;
7            int right = n - 1;
8            
9            while (left <= right) {
10                if (row[left] == row[right]) {
11                    int flippedValue = row[left] ^ 1;
12                    row[left] = flippedValue;
13                    row[right] = flippedValue;
14                }
15                left++;
16                right--;
17            }
18        }
19        return image;
20    }
21}