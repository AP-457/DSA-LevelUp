public class RecBubbleSort {
    private int[] arr;
    private int n;

    public RecBubbleSort(int[] arr, int n){
        this.arr= arr;
        this.n= n;
        sort(0, this.n-1);
    }

    public void sort(int si, int ei){
        if(si>ei) return;

        while(si<ei){
            if(arr[si]>arr[si+1])
                swap(si, si+1);
            si+=1;
        }

        sort(0, ei-1);
    }

    public void swap(int a, int b){
        int temp= arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }

    public void print(){
        System.out.print("Recursive Bubble Sort- ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
