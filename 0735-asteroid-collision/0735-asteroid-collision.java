class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
       // ArrayList <Integer>al=new ArrayList<>();
      
       Stack<Integer>st=new Stack<>();
       for(int i=0;i<n;i++){
        int curr=asteroids[i];
        boolean alive=true;
       while(alive && !st.isEmpty() && curr<0 && st.peek()>0){
        if(st.peek()< -curr){
            st.pop();
        }else if(st.peek()==-curr){
            st.pop();
            alive=false;
        }else{
            alive= false;
        }
       }
       if(alive){
        st.push(curr);
       }

       }
        int arr[]=new int[st.size()];
      for (int i = st.size() - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }


return arr;
    }
}