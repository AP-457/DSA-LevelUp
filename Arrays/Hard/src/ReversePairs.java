class reversePair{
    public int reversePairs(int[] nums) {
        return divide(nums, 0, nums.length-1);
    }

    public int divide(int[] nums, int si, int ei){
        int count= 0;
        if(si>=ei) return 0;

        int mid= si+(ei-si)/2;
        count+= divide(nums, si, mid);
        count+= divide(nums, mid+1, ei);

        count+= reversePairs(nums, si, mid, ei);
        conquer(nums,si,mid,ei);

        return count;
    }

    public int reversePairs(int[] arr, int si, int mid, int ei){
        int count= 0;
        for(int i=si; i<=mid; i++){
            int j= mid+1;

            while(j<=ei && arr[i]>(long)2*arr[j]){
                j+=1;
            }

            count+= j-mid-1;
        }

        return count;
    }

    public void conquer(int[] nums, int si, int mid, int ei){

        int[] left= new int[mid-si+1];
        int[] right= new int[ei-mid];

        int k= 0;

        for(int x=si; x<=mid; x++) left[k++]= nums[x];
        k=0;
        for(int x= mid+1; x<=ei; x++) right[k++]= nums[x];

        int i= 0, j= 0;
        k=si;

        while(i<left.length && j<right.length){
            if(left[i]<=right[j]) nums[k++]= left[i++];
            else nums[k++]= right[j++];
        }

        while(i<left.length) nums[k++]= left[i++];
        while(j<right.length) nums[k++]= right[j++];
    }
}