import java.util.*;
public class Main {
    public static void main(String[] args) {
//        1. Selection Sort
//        2. Bubble Sort
//        3. Insertion Sort
//        4. Merge Sort
//        5. Quick Sort
//        6. Recursive Bubble Sort
//        7. Recursive Insertion Sort
        start();
    }

    public static void start(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input array size- ");
        int n= sc.nextInt();
        int[] arr= new int[n];

        System.out.println("\nInput array elements");
        for(int i=0; i<n; i++) arr[i]= sc.nextInt();

        System.out.println("\nChoose the sorting technique");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort");
        System.out.println("6. Recursive Bubble Sort");
        System.out.println("7. Recursive Insertion Sort");
        System.out.println("8. Once More");

        System.out.print("\nChoose- ");
        int k= sc.nextInt();

        switch(k){
            case 1:
                new SelectionSort(arr, n);
                break;
            case 2:
                new BubbleSort(arr, n);
                break;
            case 3:
                new InsertionSort(arr,n);
                break;
            case 4:
                new MergeSort(arr,n).print();
                break;
            case 5:
                new QuickSort(arr,n).print();
                break;
            case 6:
                new RecBubbleSort(arr, n).print();
                break;
            case 7:
                new RecInsertionSort(arr, n).print();
                break;
            case 8:
                start();
                break;
            default:
                System.out.println("Wrong Input");
                start();
        }
    }
}
