public class BubbleSort {
    private int[] arr;
    private int n;

    public BubbleSort(int[] arr, int n){
        this.arr= arr;
        this.n= n;

        sort();
    }

    public void sort(){
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        print();
    }

    public void print(){
        System.out.print("Bubble Sort- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
