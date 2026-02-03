1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        ArrayList<Character> arr = new ArrayList<>();
4        int max = 0;
5        for (char j : s.toCharArray()) {
6            if (!arr.contains(j)) {
7                arr.add(j);
8
9            } else {
10                max = Math.max(max, arr.size());
11                int idx = arr.indexOf(j);
12                for (int i = 0; i <= idx; i++) {
13                    arr.remove(0);
14                }
15                arr.add(j);
16            }
17        }
18        max = Math.max(max, arr.size());
19        return max;
20
21    }
22}