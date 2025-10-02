package BinarySearch.Hard;

public class FindAPeakElementII {
    public int[] findPeakGrid(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length;

        int[] ans= new int[2];
        int i=0, j=0;

        while(i<m && j<n){
            if(i-1>=0 && mat[i-1][j]>mat[i][j]) i-=1;
            else if(j-1>=0 && mat[i][j-1]>mat[i][j]) j-=1;
            else if(i+1<m && mat[i+1][j]>mat[i][j]) i+=1;
            else if(j+1<n && mat[i][j+1]>mat[i][j]) j+=1;
            else return new int[]{i,j};
        }
        return ans;
    }
}
