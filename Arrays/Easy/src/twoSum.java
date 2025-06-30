import java.util.*;
public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> freq= new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            freq.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            if(freq.containsKey(target-nums[i])){
                if(freq.get(target-nums[i])!=i) return new int[]{i, freq.get(target-nums[i])};
            }
        }

        return new int[1];
    }
}
