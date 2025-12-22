1class Solution {
2    public List<Integer> getRow(int n) {
3        List<List<Integer>> list=new ArrayList();
4        for(int i=0;i<=n;i++){
5            List<Integer> l=new ArrayList();
6            for(int j=0;j<=i;j++){
7                if(i==j || j==0){
8                    l.add(1);
9                }
10                else{
11                    List<Integer> pl=list.get(i-1);
12                    l.add(pl.get(j-1)+pl.get(j));
13                }
14            }
15            list.add(l);
16        }
17        return list.get(n);
18    }
19}