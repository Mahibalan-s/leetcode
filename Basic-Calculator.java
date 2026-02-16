1class Solution {
2    private int evaluate(List<String> exp){
3        if (exp.isEmpty()) return 0;
4        Collections.reverse(exp);
5        long r=Integer.parseInt(exp.get(0));
6        for(int i=1;i<exp.size();i+=2){
7            String o=exp.get(i);
8            long nv = Long.parseLong(exp.get(i + 1));
9            switch(o){
10                case "+": r= r + nv;break;
11                case "-": r= r - nv;break;
12                case "*": r= r * nv;break;
13                case "/": r= r / nv;break;
14            }
15        }
16        return (int)r;
17    }
18    public int calculate(String s) {
19        Stack <String> st=new Stack<>();
20        int e=0;
21        char lastChar='(';
22        char[] ch=s.toCharArray();
23        for(int i=0;i<ch.length;i++){
24            if(ch[i]==' '){
25                continue;
26            }
27            if(Character.isDigit(ch[i])){
28                StringBuilder num=new StringBuilder();
29                while(i<ch.length && Character.isDigit(ch[i] )){
30                    num.append(ch[i++]);
31                }
32                i--;
33                st.push(num.toString());
34                lastChar='d';
35            }
36            else if(ch[i]==')'){
37                List<String> exp=new ArrayList<>();
38                while(!st.isEmpty()){
39                    if(!st.peek().equals("(") && !st.isEmpty()){
40                        exp.add(st.pop());
41                    }
42                    else{
43                        break;
44                    }
45                }
46                if(!st.isEmpty()){
47                    st.pop();
48                }
49                int r=evaluate(exp);
50                st.push(r+"");
51            }
52            else if(ch[i]=='('){
53                st.push(ch[i]+"");
54                lastChar=ch[i];
55            }
56            else{
57                if (ch[i] == '-' && lastChar == '(') {
58                    st.push("0");
59                }
60                st.push(ch[i] + "");
61                lastChar = ch[i];
62            }
63        }
64        List<String> ans=new ArrayList<>();
65        while(!st.isEmpty()){
66            ans.add(st.pop());
67        }
68        return evaluate(ans);
69    }
70}