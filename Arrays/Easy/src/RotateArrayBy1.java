public class RotateArrayBy1 {
    public void rotate(int[] arr, int k) {
        int n= arr.length;

        if(k>n) k%=n;

        reverse(arr, n-1, n-1);
        reverse(arr, 0, n-2);
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int[] arr, int si, int ei){
        while(si<ei){
            int temp= arr[si];
            arr[si]= arr[ei];
            arr[ei]= temp;

            si+=1;
            ei-=1;
        }
    }
}
