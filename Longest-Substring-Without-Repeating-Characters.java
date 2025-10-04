

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        if (s.trim().isEmpty()) { 
            return 1;
        }

        HashMap<Character, Integer> mp = new HashMap<>();
        int count = 0;
        int max = 0;
        int j = 0; // start index of current substring

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!mp.containsKey(c)) {
                mp.put(c, 1);
                count++;
            } else {
                if (mp.get(c) == 0) {
                    mp.put(c, 1);
                    count++;
                } else {
                    if (count > max) {
                        max = count;
                    }
                    // reset only characters before the duplicate
                    for (int k = j; k < i; k++) {
                        if (s.charAt(k) == c) {
                            j = k + 1;
                            break;
                        }
                        mp.put(s.charAt(k), 0);
                    }
                    mp.put(c, 1);
                    count = i - j + 1;
                }
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }

}
