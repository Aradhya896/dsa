import java.util.*;
class Solution {
    public int maxProduct(int n) {
        int product=1;
        ArrayList<Integer>al=new ArrayList<>();
        while(n>0){
            int rem=n%10;
           al.add(rem);
            n=n/10;
        }
        Collections.sort(al);
        product=al.get(al.size()-1)*al.get(al.size()-2);
        return product;
}}