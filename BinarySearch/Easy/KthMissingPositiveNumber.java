package BinarySearch.Easy;

public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int si= 0, ei= arr.length-1;

        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(arr[mid]-mid-1>=k){
                ei= mid-1;
            }else{
                si= mid+1;
            }
        }

        return si+k;
    }
}
