package BinarySearch.Easy;

class ImplementedUpperBound {
    int upperBound(int[] arr, int target) {
        // code here
        int si= 0, ei= arr.length-1;
        int ans= arr.length;

        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(arr[mid]>target){
                ans= mid;
                ei= mid-1;
            }else{
                si= mid+1;
            }
        }

        return ans;
    }
}
