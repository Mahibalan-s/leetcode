class Solution {
    public String reverseWords(String s) {
        String[] st=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            if(st[i].isEmpty()){
                continue;
            }
            sb.append(st[i]+" ");
        }
        return sb.toString().trim();
    }
}