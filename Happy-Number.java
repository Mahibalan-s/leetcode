1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = getNext(n);
5        while (fast != 1 && slow != fast) {
6            slow = getNext(slow);      
7            fast = getNext(getNext(fast)); 
8        }
9
10        return fast == 1;
11    }
12    private int getNext(int n) {
13        int totalSum = 0;
14        while (n > 0) {
15            int d = n % 10;
16            n=n/10;
17            totalSum += d * d;
18        }
19        return totalSum;
20    }
21}