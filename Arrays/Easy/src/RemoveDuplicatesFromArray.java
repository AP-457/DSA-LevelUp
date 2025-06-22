import java.util.*;
public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> str= new HashSet<>();

        int x= 0;

        for(int i=0; i<nums.length; i++){
            if(!str.contains(nums[i])){
                nums[x++]= nums[i];
                str.add(nums[i]);
            }
        }

        return x;
    }
}
