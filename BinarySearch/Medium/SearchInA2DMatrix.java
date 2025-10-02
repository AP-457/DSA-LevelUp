package BinarySearch.Medium;

public class SearchInA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix[0].length;
        int m= matrix.length;

        // if(m==n && n==1){
        //     if(matrix[0][0]==target) return true;

        //     return false;
        // }

        int sc= 0, ec= m-1;
        while(sc<=ec){
            int mid= sc+(ec-sc)/2;

            if(matrix[mid][0]==target) return true;
            else if(matrix[mid][0]>target) ec= mid-1;
            else sc= mid+1;
        }

        if(sc>0) sc-=1;
        int si= 0, ei= n-1;

        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(matrix[sc][mid]==target) return true;
            else if(matrix[sc][mid]<target) si= mid+1;
            else ei= mid-1;
        }

        return false;
    }
}
