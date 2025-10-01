class Solution {
    public int romanToInt(String s) {
        int res=0;
        HashMap <Character,Integer> rti=new HashMap<>();
        rti.put('I',1); 
        rti.put('V',5);
        rti.put('X',10);
        rti.put('L',50);
        rti.put('C',100);
        rti.put('D',500);
        rti.put('M',1000);
        for(int i=0;i<s.length()-1;i++){
            if(rti.get(s.charAt(i))>=rti.get(s.charAt(i+1))){
                res+=rti.get(s.charAt(i));
            }
            else{
                res-=rti.get(s.charAt(i));
            }
        }
        return res+rti.get(s.charAt(s.length()-1));
    }
}