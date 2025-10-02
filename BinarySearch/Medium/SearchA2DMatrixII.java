package BinarySearch.Medium;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;

        for(int i=0; i<m; i++){
            int si= 0, ei= n-1;
            if(binarySearch(si,ei, matrix[i], target)) return true;
        }

        return false;
    }

    public boolean binarySearch(int si, int ei, int[] nums, int target){
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target) ei= mid-1;
            else si= mid+1;
        }

        return false;
    }
}
