1class Solution {
2    private String[] mapping = {
3        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
4    };
5
6    public List<String> letterCombinations(String digits) {
7        List<String> result = new ArrayList<>();
8        if (digits == null || digits.length() == 0){
9            return result;
10        }
11        backtrack(result, digits, new StringBuilder(), 0);
12        return result;
13    }
14
15    private void backtrack(List<String> result, String digits, StringBuilder current, int index) {
16        if (index == digits.length()) {
17            result.add(current.toString());
18            return;
19        }
20        String letters = mapping[digits.charAt(index) - '0'];
21        for (char c : letters.toCharArray()) {
22            current.append(c);              // Choose
23            backtrack(result, digits, current, index + 1); 
24            current.deleteCharAt(current.length() - 1); 
25        }
26    }
27}