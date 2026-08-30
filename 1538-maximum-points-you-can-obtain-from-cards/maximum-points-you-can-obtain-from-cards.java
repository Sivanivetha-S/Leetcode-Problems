class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        if (k == n) {
            int sum = 0;
            for (int x : cardPoints) {
                sum += x;
            }
            return sum;
        }
        int windowSize = n - k;
        int total = 0;
        for (int x : cardPoints) {
            total += x;
        }
        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }
        int minWindow = windowSum;
        for (int i = windowSize; i < n; i++) {

            windowSum += cardPoints[i];
            windowSum -= cardPoints[i - windowSize];

            minWindow = Math.min(minWindow, windowSum);
        }
        return total - minWindow;
    }
}