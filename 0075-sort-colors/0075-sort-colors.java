class Solution {
    public void sortColors(int[] nums) {
        int low = 0;       // Pointer for the boundary of 0s (red)
        int mid = 0;       // Current element pointer (white)
        int high = nums.length - 1; // Pointer for the boundary of 2s (blue)

        // Iterate while the middle pointer is within the unsorted part
        while (mid <= high) {
            if (nums[mid] == 0) { // If current is 0 (Red)
                // Swap nums[mid] with nums[low], then advance both low and mid
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 2) { // If current is 2 (Blue)
                // Swap nums[mid] with nums[high], then decrement high (don't advance mid, as new nums[mid] needs checking)
                swap(nums, mid, high);
                high--;
            } else { // If current is 1 (White)
                // Just advance the mid pointer, as it's in the correct place for now
                mid++;
            }
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
