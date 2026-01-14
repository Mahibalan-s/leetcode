1class Solution {
2    public int[][] flipAndInvertImage(int[][] image) {
3        int n = image.length;
4        
5        for (int[] row : image) {
6            int left = 0;
7            int right = n - 1;
8            
9            while (left <= right) {
10                // If the elements are the same, they both need to be inverted
11                if (row[left] == row[right]) {
12                    // XOR with 1 flips 0 to 1 and 1 to 0
13                    int flippedValue = row[left] ^ 1;
14                    row[left] = flippedValue;
15                    row[right] = flippedValue;
16                }
17                // If they are different, they remain the same after flip + invert
18                // so we just move the pointers.
19                
20                left++;
21                right--;
22            }
23        }
24        return image;
25    }
26}