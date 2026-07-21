class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        int sum = 0;
        int index = 2;
        int iteration = arr.length / 2;
        while (iteration > 0) {
            for (int i = index; i < arr.length; i++) {
                if (i == index)
                    sum += arr[i];
                else
                    sum += arr[i] - arr[i - (index + 1)];
            }
            iteration--;
            index += 2;
        }
        return sum + arr[arr.length - 1];
    }
}