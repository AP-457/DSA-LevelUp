import java.util.*;
public class SubarrayWithSumK {
        public int subarraySum(int[] nums, int k) {
            int n= nums.length;
            int sum= 0;

            HashMap<Integer, Integer> freq= new HashMap<>();
            freq.put(sum, 1);

            int count= 0;

            for(int i:nums){
                sum+=i;

                if(freq.containsKey(sum-k)){
                    count+=freq.get(sum-k);
                }

                freq.put(sum, freq.getOrDefault(sum, 0)+1);
            }

            return count;
        }
}
