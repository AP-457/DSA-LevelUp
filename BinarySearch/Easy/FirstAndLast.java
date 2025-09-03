package BinarySearch.Easy;

class FirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
        int n= nums.length;

        if(n==0) return ans;

        if(nums[n-1]<target) return ans;
        else if(nums[0]>target) return ans;

        int si= 0, ei= n-1;
        while(si<=ei){
            int mid= si+(ei-si)/2;

            if(nums[mid]==target){
                ans[0]= mid;
                ei= mid-1;
            }else if(nums[mid]>target) ei= mid-1;
            else si= mid+1;
        }

        if(ans[0]==-1) return ans;

        si= 0;
        ei= n-1;

        while(si<=ei){
            int mid= si+(ei-si)/2;

            if(nums[mid]==target){
                ans[1]= mid;
                si= mid+1;
            }else if(nums[mid]>target) ei= mid-1;
            else si= mid+1;
        }

        return ans;
    }
}