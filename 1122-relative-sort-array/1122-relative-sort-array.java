class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int max=arr1[0];
        for(int i:arr1){
            if(i>max){
                max=i;
            }
        }
        int a[]=new int[arr1.length];
        int freq[]=new int[max+1];
        for(int i:arr1){
            freq[i]++;
        }
        int idx=0;
        for(int i=0;i<arr2.length;i++ ){
            while(freq[arr2[i]]>0){
            arr1[idx]=arr2[i];
            idx++;
            freq[arr2[i]]--;
        }}
for (int i = 0; i <= max; i++) {
            while (freq[i] > 0) {
                arr1[idx] = i;
                idx++;
                freq[i]--;
            }
        }

        return arr1;
    }
}