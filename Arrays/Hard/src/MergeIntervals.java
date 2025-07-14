import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row1[0], row2[0]);
            }
        });

        List<List<Integer>> ans= new ArrayList<>();
        int x=0;
        ans.add(Arrays.asList(intervals[0][0], intervals[0][1]));

        for(int i=1; i<intervals.length && x<intervals.length-1; i++){
            if(ans.get(x).get(1)>=intervals[i][0] && ans.get(x).get(1)>=intervals[i][1]){
                continue;
            }else if(intervals[i][1]>=ans.get(x).get(1)){
                if(intervals[i][0]<=ans.get(x).get(1)){
                    ans.get(x).set(1, intervals[i][1]);
                }else{
                    ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
                    x+=1;
                }
            }else{
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
                x+=1;
            }
        }

        int[][] abc= new int[ans.size()][2];
        int k= 0;

        for(List<Integer> rows: ans){
            abc[k][0]= rows.get(0);
            abc[k][1]= rows.get(1);

            k+=1;
        }
        return abc;
    }
}
