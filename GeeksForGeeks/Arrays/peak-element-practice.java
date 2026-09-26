class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;

        // Only one element
        if (n == 1) {
            return 0;
        }

        // Check first element
        if (arr[0] > arr[1]) {
            return 0;
        }

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }

        // Check last element
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        return -1;
    }
}