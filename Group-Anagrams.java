1class Solution {
2
3    boolean isAnagram(String s,String str){
4            int arr[]=new int[26];
5            for(int i=0;i<s.length();i++){
6                arr[s.charAt(i)-'a']++;
7            }
8            for(int i=0;i<str.length();i++){
9                if(arr[str.charAt(i)-'a']>0){
10                    arr[str.charAt(i)-'a']--;
11                }
12                else{
13                    return false;
14                }
15            }
16            for(int i=0;i<26;i++){
17                if(arr[i]>0){
18                    return false;
19                }
20            }
21            return true;
22        }
23    public List<List<String>> groupAnagrams(String[] strs) {
24        List<List<String>> list=new ArrayList<>();
25        List<String> l=new ArrayList<>();
26        int c=1;
27        l.add(strs[0]);
28        int ll=1;
29        list.add(l);
30        for(int i=1;i<strs.length;i++){
31            c=1;
32            for(int j=0;j<ll;j++){
33                if(isAnagram(list.get(j).get(0),strs[i])){
34                    list.get(j).add(strs[i]);
35                    c=0;
36                    break;
37                }
38            }
39            if(c==1){
40                List <String> sl=new ArrayList<>();
41                sl.add(strs[i]);
42                list.add(sl);
43                ll++;
44                c=1;
45            }
46            
47        }
48        return list;
49        
50        
51    }
52}