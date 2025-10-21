class Solution {
    public int strStr(String h, String n) {
        if (n.isEmpty()) return 0;

        for (int i = 0; i <= h.length() - n.length(); i++) {
            int j = 0;
            while (j < n.length() && h.charAt(i + j) == n.charAt(j)) {
                j++;
            }
            if (j == n.length()) {
                return i; // found substring
            }
        }
        return -1;
    }
}
