class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        int x=0,y=0;
        for(String i:tokens){
            if(i.length()>1 || Character.isDigit(i.charAt(0))){
                st.push(Integer.parseInt(i));
            }
            else{
                if(!st.isEmpty()){
                    y=st.pop();
                }
                if(!st.isEmpty()){
                    x=st.pop();
                }
                if(i.equals("+")){
                    st.push(x+y);
                }
                else if(i.equals("-")){
                    st.push(x-y);
                }
                else if(i.equals("*")){
                    st.push(x*y);
                }
                else if(i.equals("/")){
                    st.push(x/y);
                }
            }
        }
        return st.pop();
    }
}