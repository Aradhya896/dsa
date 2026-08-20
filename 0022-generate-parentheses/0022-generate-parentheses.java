class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>al=new ArrayList<>();
        String s="";
        return generate(n,s,al,0,0);
    }public static List<String> generate(int n,String s,List<String>al,int open,int close){
        if(s.length()==2*n){
            al.add(s);
            return al;
        }if(open<n){
        generate(n,s+"(",al,open+1,close );
        }if(close<open){
            generate(n,s+")",al,open,close+1);
        }
        return al;
    }
}