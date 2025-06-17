public class QuickSort {
    private int[] arr;
    private int n;

    public QuickSort(int[] arr, int n){
        this.arr= arr;
        this.n= n;

        sort(0, n-1);
    }

    public void sort(int si, int ei){
        if(si>ei) return;

        int pi= pivot(si, ei);
        sort(si, pi-1);
        sort(pi+1, ei);
    }

    public int pivot(int si, int ei){
        int k= arr[ei];
        int i=si-1;

        for(int j=si; j<ei; j++){
            if(arr[j]<=k){
                i+=1;
                int temp= arr[j];
                arr[j]= arr[i];
            }
        }
        int temp= arr[i+1];
        arr[i+1]= arr[ei];
        arr[ei]= temp;

        return i+1;
    }

    public void print(){
        System.out.print("Quick Sort- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
