package BinarySearch.Easy;

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;

        if(target>nums[n-1]) return n;
        else if(target==nums[n-1]) return n-1;
        else if(target<nums[0]) return 0;

        int si= 0, ei= n-1;
        int ans= 0;

        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                ei= mid-1;
            }else{
                ans= mid+1;
                si= mid+1;
            }
        }

        return ans;
    }
}