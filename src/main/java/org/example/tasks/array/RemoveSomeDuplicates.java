package org.example.tasks.array;

public class RemoveSomeDuplicates {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 0;
        int count = 0;
        int currentCount = 0;
        Integer prev = null;
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (prev != null && prev.equals(currentValue)) {
                if (currentCount >= 1) {
                    count++;
                } else {
                    nums[currentIndex] = currentValue;
                    currentIndex++;
                }
                currentCount++;
            } else {
                nums[currentIndex] = currentValue;
                currentIndex++;
                currentCount = 0;
            }
            prev = currentValue;
        }
        for (int i = currentIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums.length - count;
    }
}
