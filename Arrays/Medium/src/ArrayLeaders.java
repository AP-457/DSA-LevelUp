public class ArrayLeaders {
    static ArrayList<Integer> leaders(int nums[]) {
        ArrayList<Integer> ans= new ArrayList<>();
        int max= Integer.MIN_VALUE;

        for(int i=nums.length-1; i>=0; i--){
            if(i==nums.length-1){
                max= nums[i];
                ans.add(max);
                continue;
            }

            if(nums[i]>=max){
                max= nums[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
}
