1class Solution {
2    public boolean checkOnesSegment(String s) {
3        // If the string contains "01", it means a zero is separating two segments of ones.
4        // Therefore, it must be false.
5        return !s.contains("01");
6    }
7}