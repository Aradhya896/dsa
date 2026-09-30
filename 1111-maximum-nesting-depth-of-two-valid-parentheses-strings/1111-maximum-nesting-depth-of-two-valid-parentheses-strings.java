class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[]=new int[seq.length()];
        int c=0;
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                c++;
                if(c%2==0){
                    arr[i]=1;
                    
                }else{
                    arr[i]=0;
                }
            }else{
                if(c%2==0){
                    arr[i]=1;
                    
                }else{
                    arr[i]=0;
                }
                c--;
            }
        }
        return arr;
    }
}