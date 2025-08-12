class Solution {
    // public boolean isPalindrome(String s) {
    //     int i=0;int j=s.length()-1;
    //     while(i<j){
    //         if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))){
    //             if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
    //                 i++;j--;
    //             }else{
    //                 return false;
    //             }
    //         }else if(!Character.isLetterOrDigit(s.charAt(i)))
    //             i++;
    //         else
    //             j--;
    //     }
    //     return true;
    // }
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char startc = s.charAt(start);
            char endc = s.charAt(end);

            // Convert uppercase to lowercase
            if (startc >= 'A' && startc <= 'Z') startc += 32;
            if (endc >= 'A' && endc <= 'Z') endc += 32;

            // Skip non-alphanumeric from start
            if (!((startc >= 'a' && startc <= 'z') || (startc >= '0' && startc <= '9'))) {
                start++;
                continue;
            }

            // Skip non-alphanumeric from end
            if (!((endc >= 'a' && endc <= 'z') || (endc >= '0' && endc <= '9'))) {
                end--;
                continue;
            }

            // Compare
            if (startc != endc) return false;

            start++;
            end--;
        }
        return true;
    }
}