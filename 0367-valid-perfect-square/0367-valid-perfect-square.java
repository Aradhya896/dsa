class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1;
        int h=num;
        while(l<=h){
            int mid=l+(h-l)/2;
            long sq=(long)mid*mid;
            if(num==sq){
                return true;
            }
            else if(num<sq){
                h=mid-1;

            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
}