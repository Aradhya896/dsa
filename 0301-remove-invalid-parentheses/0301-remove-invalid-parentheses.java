class Solution {
    List<String> ans = new ArrayList<>();
    int minRemove = Integer.MAX_VALUE;

    public List<String> removeInvalidParentheses(String s) {
        solve(s, 0, "", 0, 0);
        return ans;
    }

    void solve(String s, int idx, String curr, int balance, int removed) {

        if (balance < 0) {
            return;
        }
        if (idx == s.length()) {

            if (balance == 0) {

                if (removed < minRemove) {
                    minRemove = removed;
                    ans.clear();
                    ans.add(curr);
                } 
                else if (removed == minRemove && !ans.contains(curr)) {
                ans.add(curr);
                }
            }

            return;
        }

        char ch = s.charAt(idx);
        if (ch != '(' && ch != ')') {
        solve(s, idx + 1, curr + ch, balance, removed);
        }

        else {
            if (ch == '(') {
            solve(s, idx + 1, curr + ch, balance + 1, removed);
            } 
            else {
            solve(s, idx + 1, curr + ch, balance - 1, removed);
            }
        solve(s, idx + 1, curr, balance, removed + 1);
        }
    }
}