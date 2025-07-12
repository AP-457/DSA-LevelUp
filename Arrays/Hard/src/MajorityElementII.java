import java.util.*;
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int[] freq= new int[2];
        int[] cand= new int[2];

        for(int i=0; i<nums.length; i++){
            if(freq[0]==0 && nums[i]!=cand[1]){
                freq[0]+=1;
                cand[0]= nums[i];
            }else if(freq[1]==0 && nums[i]!=cand[0]){
                freq[1]+=1;
                cand[1]= nums[i];
            }else if(cand[0]==nums[i]) freq[0]+=1;
            else if(cand[1]==nums[i]) freq[1]+=1;
            else{
                freq[0]-=1;
                freq[1]-=1;
            }
        }

        if(freq[0]>nums.length/3) ans.add(cand[0]);

        if(freq[1]>nums.length/3) ans.add(cand[1]);

        return ans;
    }
}
