package BinarySearch.Hard;

public class CapacityToShipPackagesWitingDDays {
    public int shipWithinDays(int[] weights, int days) {
        int limit = 0;
        int si= Integer.MIN_VALUE;

        for (int i : weights){
            limit += i;
            si= Math.max(si,i);
        }

        int ei = limit;
        int ans = Integer.MAX_VALUE;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (check(weights, days, mid)) {
                ans = Math.min(ans, mid);
                ei = mid-1;
            } else {
                si = mid + 1;
            }
        }

        return ans;
    }

    public boolean check(int[] weights, int days, int mid) {
        int daysNeeded = 1, currentLoad = 0;
        for (int weight : weights) {
            if (currentLoad + weight > mid) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }
        return daysNeeded <= days;
    }
}
