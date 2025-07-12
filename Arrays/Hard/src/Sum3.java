import java.util.*;
public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        Set<List<Integer>> abc = new HashSet<>();

        for(int i=0; i<n-1; i++){
            int target = -nums[i];
            int si = i+1, ei = n-1;

            while(si<ei) {
                if(nums[si]+nums[ei] == target) {
                    abc.add(Arrays.asList(nums[i],nums[si],nums[ei]));
                    while (si<ei && nums[si]==nums[si+1]) si+=1;
                    while (si<ei && nums[ei]==nums[ei-1]) ei-=1;
                    si+=1;
                    ei-=1;
                } else if (nums[si]+nums[ei] < target) {
                    si+=1;
                } else {
                    ei-=1;
                }
            }
        }
        return new ArrayList<>(abc);
    }
}
