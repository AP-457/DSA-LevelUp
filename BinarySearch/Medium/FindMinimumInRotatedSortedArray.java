package BinarySearch.Medium;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int mini = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] >= nums[low]){
                mini = Math.min(mini, nums[low]);
                low = mid + 1;
            } else {
                mini = Math.min(mini, nums[mid]);
                high = mid - 1;
            }
        }
        return mini;
    }
}
