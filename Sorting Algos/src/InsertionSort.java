public class InsertionSort {
    private int[] arr;
    private int n;

    public InsertionSort(int[] arr, int n){
        this.arr=arr;
        this.n=n;

        sort();
    }

    public void sort(){
        for(int i=1; i<n; i++){
            int k=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j-=1;
            }

            arr[j+1]=k;
        }

        print();
    }

    public void print(){
        System.out.print("Insertion Sort- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
