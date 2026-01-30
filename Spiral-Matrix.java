1class Solution {
2    public List<Integer> spiralOrder(int[][] arr) {
3        List <Integer> list=new ArrayList<>();
4        int l=0;
5        int r=arr[0].length-1;
6        int t=0;
7        int b=arr.length-1;
8        while(l<=r && t<=b){
9            for(int j=l;j<=r;j++){
10                if(l>r){
11                    break;
12                }
13                list.add(arr[t][j]);
14            }
15            if(l>r){
16                    break;
17                }
18            t++;
19            for(int j=t;j<=b;j++){
20                if(t>b){
21                    break;
22                }
23                list.add(arr[j][r]);
24            }
25            if(t>b){
26                    break;
27                }
28            r--;
29            for(int j=r;j>=l;j--){
30                if(l>r){
31                    break;
32                }
33                list.add(arr[b][j]);
34            }
35            if(l>r){
36                    break;
37                }
38            b--;
39            for(int j=b;j>=t;j--){
40                if(t>b){
41                    break;
42                }
43                list.add(arr[j][l]);
44            }
45            if(t>b){
46                    break;
47                }
48            l++;
49        }
50        return list;
51    }
52}