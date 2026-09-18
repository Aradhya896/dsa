class Solution {

    Set<Integer> ans = new HashSet<>();

    public int[] findEvenNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];
        func(digits, 0, 0, used);
        int[] result = new int[ans.size()];
        int i = 0;
        for (int num : ans) {
            result[i++] = num;
        }

        Arrays.sort(result);

        return result;
    }

    void func(int[] digits, int num, int l, boolean[] used) {

        if (l == 3) {
            if (num % 2 == 0) {
                ans.add(num);
            }

            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (used[i]) {
                continue;
            }
            if (l == 0 && digits[i] == 0) {
                continue;
            }
            used[i] = true;

            func(
                digits,
                num * 10 + digits[i],
                l + 1,
                used
            );
            used[i] = false;
        }
    }
}