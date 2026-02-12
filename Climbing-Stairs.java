1class Solution {
2    public int climbStairs(int n) {
3        int c=0;
4        int a=0;
5        int b=1;
6        while(n>0){
7            c=a+b;
8            a=b;
9            b=c;
10            n--;
11        }
12        return b;
13    }
14}