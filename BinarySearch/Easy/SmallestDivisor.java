package BinarySearch.Easy;

public class SmallestDivisor {
        public int smallestDivisor(int[] nums, int threshold) {
            int limit= Integer.MIN_VALUE;
            for(int i: nums) limit= Math.max(i,limit);

            int si= 1, ei= limit;
            long ans= Integer.MAX_VALUE;
            while(si<=ei){
                int mid= si+(ei-si)/2;
                if(check(nums, threshold, mid)){
                    ans= Math.min(mid, ans);
                    ei= mid-1;
                }else{
                    si= mid+1;
                }
            }

            // if(ans==Integer.MAX_VALUE) return -1;

            return (int)ans;
        }

        public boolean check(int[] nums, int th, int mid){
            long sum= 0;

            for(int i: nums){
                sum+= Math.ceil((double)i/mid);
            }

            return sum<=th;
        }
}
