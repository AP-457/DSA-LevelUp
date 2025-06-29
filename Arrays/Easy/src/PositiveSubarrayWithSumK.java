public class PositiveSubarrayWithSumK {
        public static int longestSubarrayWithSumK(int []a, long k) {
            // Write your code here
            int n = a.length;
            int si = 0, ei = 0;

            int ans = 0;
            int sum = a[si];

            while (ei < n) {
                while (sum > k && si <= ei) sum -= a[si++];

                if (sum == k) ans = Math.max(ans, ei - si + 1);

                ei += 1;
                if (ei < n) sum += a[ei];
            }

            return ans;
        }
}
