package BinarySearch.Hard;

public class MinimumNumberOfDaysToMakeMBoquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int x = m * k;
        int n = bloomDay.length;

        if (x > n)
            return -1;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i : bloomDay) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        int ans = Integer.MAX_VALUE;

        while (min <= max) {
            int mid = min + (max - min) / 2;

            if (isPossible(bloomDay, m, k, mid)) {
                ans = Math.min(ans, mid);
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        if(ans==Integer.MAX_VALUE) return -1;

        return ans;
    }

    public boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int bouquets = 0;
        int flowers = 0;

        for (int day : bloomDay) {
            if (day <= mid) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}
