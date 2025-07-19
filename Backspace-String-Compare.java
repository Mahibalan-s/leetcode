class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st1 = new Stack<>();
        Stack <Character> st2 = new Stack<>();
        int l1,l2;
        l1=s.length();
        l2=t.length();
        for(int i=0;i<l1;i++){
            if(s.charAt(i) != '#'){
                st1.push(s.charAt(i));
            }
            else if(s.charAt(i)=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
        }
        for(int i=0;i<l2;i++){
            if(t.charAt(i) != '#'){
                st2.push(t.charAt(i));
            }
            else if(t.charAt(i)=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop()!=st2.pop()){
                return false;
            }
        }
        if(!st1.isEmpty() || !st2.isEmpty()){
            return false;
        }
        return true;
    }
}