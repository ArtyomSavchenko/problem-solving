package org.example.tasks;

public class UniqueSortedArray {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 0;
        int count = 0;
        Integer prev = null;
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (prev != null && prev.equals(currentValue)) {
                count++;
            } else {
                nums[currentIndex] = currentValue;
                currentIndex++;
            }
            prev = currentValue;
        }
        for (int i = currentIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums.length - count;
    }
}
