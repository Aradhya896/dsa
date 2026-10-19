class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l1=new ArrayList<>();
       Arrays.sort(nums);
int x=0;
int y=0;

int l=0;
int h=nums.length-1;
while(l<=h){
    int mid=(l+h)/2;
    if(nums[mid]==target){

    x=mid;
    y=mid;
    while(x>=0 && nums[x]==target){
        x--;
    }while(y<nums.length && nums[y]==target){
        y++;
    
    }
for(int i=x+1;i<=y-1;i++){
l1.add(i);
}return l1;
} else if (nums[mid] < target) {
                l = mid + 1;
            }

            else {
                h = mid - 1;
            }
        } 
return l1;
    }
}