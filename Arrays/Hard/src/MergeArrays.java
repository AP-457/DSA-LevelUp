public class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i1=0, i2=0, x=0;
        int[] merged=new int[m+n];
        while(i1<m && i2<n){
            if(nums1[i1]<=nums2[i2]){
                merged[x++]=nums1[i1++];
            }else{
                merged[x++]=nums2[i2++];
            }
        }

        while(i1<m){
            merged[x++]=nums1[i1++];
        }

        while(i2<n){
            merged[x++]=nums2[i2++];
        }

        x=0;
        for(int i:merged){
            nums1[x++]=i;
        }
    }
}
