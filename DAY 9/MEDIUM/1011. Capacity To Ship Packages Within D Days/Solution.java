class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = getMax(weights);
        int high = getSum(weights);
        while (low < high) {
            int midWeight = (low + high) / 2;
            if (canShip(midWeight, days, weights)) {
                high = midWeight;
            } else {
                low = midWeight + 1;
            }
        }
        return low;
    }

    // helper method
    public int getMax(int[] weights) {
        int high = 0;
        for (int weight : weights) {
            if (weight > high)
                high = weight;
        }
        return high;
    }

    public int getSum(int[] weights) {
        int sum = 0;
        for (int weight : weights) {
            sum += weight;
        }
        return sum;
    }

    public boolean canShip(int minPredictedWeight, int days, int[] weights) {
        int currentLoad = 0;
        for (int weight : weights) {
            if (currentLoad + weight > minPredictedWeight) {
                days--;
                currentLoad = 0;
            }
            if (days == 0)
                return false;
            currentLoad += weight;
        }
        return true;
    }
}