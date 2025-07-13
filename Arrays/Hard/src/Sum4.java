import java.util.*;
public class Sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans= new HashSet<>();
        int n= nums.length;

        Arrays.sort(nums);

        for(int i= 0; i<=n-4; i++){
            for(int j=i+1; j<=n-3; j++){
                int si= j+1;
                int ei= n-1;

                while(si<ei){
                    long sum= (long)nums[i]+(long)nums[j]+(long)nums[si]+(long)nums[ei];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[si],nums[ei]));
                        while(si<ei && nums[si]==nums[si+1]) si+=1;
                        while(si<ei && nums[ei]==nums[ei-1]) ei-=1;

                        si+=1;
                        ei-=1;
                    }else if(sum<target){
                        si+=1;
                    }else{
                        ei-=1;
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
