package BinarySearch.Hard;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int n= nums.length;

        int si= 0, ei= n-1;

        while(si<=ei){
            int mid= si+(ei-si)/2;

            if(mid>0 && nums[mid]<nums[mid-1]){
                if(mid<n-1 && nums[mid+1]<nums[mid-1]){
                    ei= mid-1;
                }else{
                    si= mid+1;
                }
            }else if(mid<n-1 && nums[mid]<nums[mid+1]){
                if(mid>0 && nums[mid+1]<nums[mid-1]){
                    ei= mid-1;
                }else{
                    si= mid+1;
                }
            }else{
                return mid;
            }
        }

        return -1;
    }
}
