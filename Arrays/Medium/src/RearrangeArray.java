public class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] arr= new int[n];

        int si=0, ei=1;

        for(int i= 0; i<n; i++){
            if(nums[i]>0){
                arr[si]= nums[i];
                si+=2;
            }
            else {
                arr[ei]= nums[i];
                ei+=2;
            }
        }

        return arr;
    }
}
