public class MaxOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int si= 0, ei= 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                si= i;
                ei= si;
                break;
            }
        }

        boolean foundZero= false;
        int ans= Integer.MIN_VALUE;

        int count= 0;

        while(ei<n){
            if(nums[si]==1 && nums[ei]==1 && !foundZero){
                count= ei-si+1;
                ei+=1;
            }else if(nums[ei]==1 && foundZero){
                si= ei;
                foundZero= false;
                ei+=1;
            }else{
                ans= Math.max(ans, count);
                foundZero= true;
                ei+=1;
            }
        }

        if(nums[si]==1 && nums[ei-1]==1){
            ans= Math.max(ans, ei-si);
        }

        return ans;
    }
}
