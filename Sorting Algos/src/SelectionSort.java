public class SelectionSort {
    private int[] arr;
    private int n;

    public SelectionSort(int[] arr, int n){
        this.arr= arr;
        this.n= n;

        sort();
    }

    public void sort(){
        for(int i=0; i<n; i++){
            int mini= i;
            for(int j=i; j<n; j++){
                if(arr[mini] > arr[j]){
                    mini= j;
                }
            }

            if(arr[i]>arr[mini]){
                int temp= arr[i];
                arr[i]= arr[mini];
                arr[mini]= temp;
            }
        }
        print();
    }

    public void print(){
        System.out.print("Selection Sort- ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
