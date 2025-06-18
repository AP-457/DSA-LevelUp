public class RecInsertionSort {
    private int[] arr;
    private int n;

    public RecInsertionSort(int[] arr, int n){
        this.arr= arr;
        this.n= n;

        sort(1, n-1);
    }

    public void sort(int si, int ei){
        if(si>ei) return;

        int j= si;
        while(j>0 && arr[j-1]>arr[j]){
            int temp= arr[j-1];
            arr[j-1]= arr[j];
            arr[j]= temp;

            j-=1;
        }

        sort(si+1, ei);
    }

    public void print(){
        System.out.print("Insertion Sort using recursion- ");
        for(int i:arr) System.out.print(i+" ");
    }
}
