class Solution {
    public int numberOfSteps(int num) {
        if(num<=0){
            return 0;
        }
        int a=0;
        int b=0;
        if(num%2==0){
           a=1+numberOfSteps(num/2);
        }else{
            b=1+numberOfSteps(num-1);
        }
        return a+b;
    }
}