1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if(s.length()==1){
4            return 1;
5        }
6        else if(s.length()==0){
7            return 0;
8        }
9        int c=1;
10        int max=Integer.MIN_VALUE;
11        int i=0;
12        int j=1;
13        Map <Character,Integer> hm=new HashMap<>();
14        hm.put(s.charAt(i),1);
15        while(j<s.length()){
16            if(!hm.containsKey(s.charAt(j))){
17                c++;
18                hm.put(s.charAt(j),1);
19                j++;
20            }
21            else{
22                max=Math.max(c,max);
23                hm.clear();
24                i++;
25                j=i+1;
26                hm.put(s.charAt(i),1);
27                c=1;
28            }
29            
30        }
31        max=Math.max(c,max);
32        return max;
33    }
34}
35