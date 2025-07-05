public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int sum= 0, max= Integer.MIN_VALUE;

        for(int i:nums){
            if(sum<0) sum= 0;

            sum+=i;
            max= Math.max(sum, max);
        }

        return max;
    }
}
