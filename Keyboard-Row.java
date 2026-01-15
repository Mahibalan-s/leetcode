1import java.util.*;
2
3class Solution {
4    public String[] findWords(String[] words) {
5        int[] charToRow = new int[26];
6        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
7        
8        for (int i = 0; i < rows.length; i++) {
9            for (char c : rows[i].toCharArray()) {
10                charToRow[c - 'a'] = i;
11            }
12        }
13
14        List<String> result = new ArrayList<>();
15        for (String word : words) {
16            if (word.isEmpty()) continue;
17            
18            String lowerWord = word.toLowerCase();
19            int firstRowId = charToRow[lowerWord.charAt(0) - 'a'];
20            boolean isValid = true;
21
22            for (int i = 1; i < lowerWord.length(); i++) {
23                if (charToRow[lowerWord.charAt(i) - 'a'] != firstRowId) {
24                    isValid = false;
25                    break;
26                }
27            }
28
29            if (isValid) {
30                result.add(word);
31            }
32        }
33        return result.toArray(new String[0]);
34    }
35}