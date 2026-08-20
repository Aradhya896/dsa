class Solution {
    public List<String> validStrings(int n) {
        List<String>al=new ArrayList<>();
        String s="";
        
       return generate(n,s,al);
    }
    public static List<String> generate(int n,String s, List<String>al){
        if(s.length()==n){
            al.add(s);
            return al;
        }
        generate(n,s+"1",al);

        if(s.isEmpty() || s.charAt(s.length()-1)!='0'){
            generate(n,s+"0",al);

            

        }return al;
    }
}