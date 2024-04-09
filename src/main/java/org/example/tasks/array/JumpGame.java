package org.example.tasks.array;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int jump = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (jump <= nums[i] + i) {
                jump = i;
            }
        }
        return jump == 0;
    }
}
