import java.util.ArrayList;

public class MergeSort {
    private int[] arr;
    private int n;

    public MergeSort(int[] arr, int n){
        this.arr= arr;
        this.n= n;

        sort(arr, 0, n-1);
    }

    public void sort(int[] arr, int si, int ei){
        if(si>=ei) return;

        int mid= si+(ei-si)/2;

        sort(arr, si, mid);
        sort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp= new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public void print(){
        System.out.print("Merge Sort- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
