class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        int l=s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char d=st.pop();
                if(d=='{' && s.charAt(i)!='}'){
                    return false;
                }
                else if(d=='[' && s.charAt(i)!=']'){
                    return false;
                }
                else if(d=='(' && s.charAt(i)!=')'){
                    return false;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}