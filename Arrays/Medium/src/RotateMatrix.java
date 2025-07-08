public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n= matrix.length;

        for(int i=0; i<n; i++){
            for(int j= i; j<n; j++){
                swap(matrix, i, j);
            }
        }

        for(int i=0; i<n; i++){
            int si= 0, ei= n-1;

            while(si<=ei){
                swap2(matrix, i, si, ei);
                si+=1;
                ei-=1;
            }
        }
    }

    public void swap2(int[][] matrix, int i, int si, int ei){
        int temp= matrix[i][si];
        matrix[i][si]= matrix[i][ei];
        matrix[i][ei]= temp;
    }

    public void swap(int[][] matrix, int i, int j){
        int temp= matrix[i][j];
        matrix[i][j]= matrix[j][i];
        matrix[j][i]= temp;
    }
}
