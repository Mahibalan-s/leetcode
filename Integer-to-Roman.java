1class Solution {
2    public String intToRoman(int num) {
3        StringBuilder sb=new StringBuilder();
4        Map <Integer,Character> hm=new HashMap<>();
5        hm.put(1,'I');
6        hm.put(5,'V');
7        hm.put(10,'X');
8        hm.put(50,'L');
9        hm.put(100,'C');
10        hm.put(500,'D');
11        hm.put(1000,'M');
12        while(num>0){
13            if(num>=1000){
14                num-=1000;
15                sb.append(hm.get(1000));
16            }
17            else if(num>=900){
18                num-=900;
19                sb.append(hm.get(100));
20                sb.append(hm.get(1000));
21            }
22            else if(num>=500){
23                num-=500;
24                sb.append(hm.get(500));
25            }
26            else if(num>=400){
27                num-=400;
28                sb.append(hm.get(100));
29                sb.append(hm.get(500));
30            }
31            else if(num>=100){
32                num-=100;
33                sb.append(hm.get(100));
34            }
35            else if(num>=90){
36                num-=90;
37                sb.append(hm.get(10));
38                sb.append(hm.get(100));
39            }
40            else if(num>=50){
41                num-=50;
42                sb.append(hm.get(50));
43            }
44            else if(num>=40){
45                num-=40;
46                sb.append(hm.get(10));
47                sb.append(hm.get(50));
48            }
49            else if(num>=10){
50                num-=10;
51                sb.append(hm.get(10));
52            }
53            else if(num>=9){
54                num-=9;
55                sb.append(hm.get(1));
56                sb.append(hm.get(10));
57            }
58            else if(num>=5){
59                num-=5;
60                sb.append(hm.get(5));
61            }
62            else if(num>=4){
63                num-=4;
64                sb.append(hm.get(1));
65                sb.append(hm.get(5));
66            }
67            else if(num>=1){
68                num-=1;
69                sb.append(hm.get(1));
70            }
71        }
72        return sb.toString();
73    }
74}