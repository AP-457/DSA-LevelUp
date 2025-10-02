package BinarySearch.Hard;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;

        int[] newArr= new int[n1+n2];

        int s1= 0, s2= 0, e1= n1-1, e2= n2-1;
        int x= 0;

        while(s1<=e1 && s2<=e2){
            if(nums1[s1]<=nums2[s2]){
                newArr[x++]= nums1[s1];
                s1+=1;
            }else{
                newArr[x++]= nums2[s2];
                s2+=1;
            }
        }

        while(s1<=e1) newArr[x++]= nums1[s1++];
        while(s2<=e2) newArr[x++]= nums2[s2++];

        int mid= (x-1)/2;

        if(newArr.length%2==0){
            return (double)(newArr[mid]+newArr[mid+1])/2;
        }else{
            return (double)(newArr[mid]);
        }
    }
}
