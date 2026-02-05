1class Solution {
2    public int[][] merge(int[][] nums) {
3        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
4        List <int[]> m=new ArrayList<>();
5        for(int[] interval: nums){
6            if(m.isEmpty() || interval[0]>(m.get(m.size()-1)[1])){
7                m.add(interval);
8            }
9            else{
10                m.get(m.size()-1)[1]=Math.max(m.get(m.size()-1)[1],interval[1]);
11            }
12        }
13        return m.toArray(new int[m.size()][2]);
14    }
15}