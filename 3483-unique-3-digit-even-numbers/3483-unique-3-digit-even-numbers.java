/*class Solution {
    public int totalNumbers(int[] digits) {
        boolean flag[]=new boolean[digits.length];
       // Arrays.fill(flag,false);
       return func(digits,0,flag);
    }
    int func(int digits[],int l,boolean flag[]){
        if(l==3){
            return 1;
        }
        int count=0;
        for(int i=0;i<digits.length;i++){
             
        if(flag[i]){
            continue;
        }
        if(l==0 && digits[i]==0){
        
            continue;
        }
        if(l==2 && digits[i]%2!=0){
            continue;
        }
        flag[i]=true;
       count+=func(digits,l+1,flag);
        flag[i]=false;
         } 
         return count;
    }}*/

    class Solution {
    public int totalNumbers(int[] digits) {
        boolean flag[] = new boolean[digits.length];
        Arrays.sort(digits);
        return func(digits, 0, flag);
    }

    int func(int digits[], int l, boolean flag[]) {

        if (l == 3) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < digits.length; i++) {

if (i > 0 && digits[i] == digits[i - 1] && !flag[i - 1]) {
                continue;
            }
            if (flag[i]) {
                continue;
            }

            // First digit cannot be 0
            if (l == 0 && digits[i] == 0) {
                continue;
            }

            // Last digit must be even
            if (l == 2 && digits[i] % 2 != 0) {
                continue;
            }

            flag[i] = true;

            count += func(digits, l + 1, flag);

            flag[i] = false;
        }

        return count;
    }
}
