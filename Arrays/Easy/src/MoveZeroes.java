class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        if(n==1) return;

        int si= 0, ei= 1;

        for(;ei<n; ei++){
            if(nums[si]==0 && nums[ei]!=0){
                nums[si]= nums[ei];
                nums[ei]= 0;
                si+=1;
            }else if(nums[si]!=0 && nums[ei]!=0){
                si+=1;
            }else if(nums[si]!=0 && nums[ei]==0){
                si+=1;
            }
        }
    }
}