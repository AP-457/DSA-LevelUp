package Strings.Easy;

public class RemoveOuterParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(') count++;
            else count--;

            if (count == 0) {
                ans.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }

        return ans.toString();
    }
}
