package BinarySearch.Hard;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max= Integer.MIN_VALUE;
        for(int i:piles) max=Math.max(max, i);

        int si= 1, ei= max;
        int ans= Integer.MAX_VALUE;

        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(isPossible(piles, h, mid)){
                ans= Math.min(ans, mid);
                ei= mid-1;
            }else{
                si= mid+1;
            }
        }

        return ans;
    }

    public boolean isPossible(int[] piles, int h, int num){
        int hours= 0;
        for(int pile: piles) hours+= Math.ceil((double)pile/num);

        return hours<=h;
    }
}
