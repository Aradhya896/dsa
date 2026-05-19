class Solution {
    public boolean isPalindrome(int x) {
        int s=0;
        int r;
        int y=x;
        while(x>0){
            r=x%10;
            s=s*10+r;
            x=x/10;
            
        }
        if(y==s){
            return true;
        }else {
            return false;
        }
    }
}