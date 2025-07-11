import java.util.*;
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        ans.add(Arrays.asList(1));

        if(numRows==1) return ans;

        ans.add(Arrays.asList(1,1));

        if(numRows==2) return ans;

        for(int i=2; i<numRows; i++){
            List<Integer> temp= new ArrayList<>();
            temp.add(1);
            for(int j=1; j<i; j++){
                int a= ans.get(i-1).get(j-1);
                int b= ans.get(i-1).get(j);

                temp.add(a+b);
            }

            temp.add(1);

            ans.add(temp);
        }

        return ans;
    }
}
