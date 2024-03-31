package org.example.tasks.array;

public class RemoveArrayElement {
    public int removeElement(int[] nums, int val) {
        int currentIndex = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (val == currentValue) {
                count++;
            } else {
                nums[currentIndex] = currentValue;
                currentIndex++;
            }
        }
        for (int i = currentIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums.length - count;
    }
}
