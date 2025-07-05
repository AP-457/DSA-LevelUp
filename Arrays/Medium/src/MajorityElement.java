public class MajorityElement {
    public int majorityElement(int[] nums) {
        int ans= 0, count= 0;

        for(int i:nums){
            if(count==0){
                ans= i;
                count+=1;
            }else if(i==ans){
                count+=1;
            }else{
                count-=1;
            }
        }

        return ans;
    }
}
