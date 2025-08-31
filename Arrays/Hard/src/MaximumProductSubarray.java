public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int ans= Integer.MIN_VALUE;
        int curr= 1;

        int curr2= 1;

        for(int i=0; i<nums.length; i++){
            curr*=nums[i];
            ans= Math.max(curr, ans);

            if(curr==0){
                curr= 1;
                // ans= Math.max(curr,ans);
            }
        }

        for(int i=nums.length-1; i>=0; i--){
            curr2*=nums[i];
            ans= Math.max(curr2, ans);

            if(curr2==0){
                curr2= 1;
                // ans= Math.max(curr2,ans);
            }
        }

        return ans;
    }
}