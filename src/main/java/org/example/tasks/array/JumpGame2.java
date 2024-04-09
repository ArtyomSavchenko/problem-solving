package org.example.tasks.array;

public class JumpGame2 {
    public boolean canJump(int[] nums) {
        boolean[] memo = new boolean[nums.length];
        memo[0] = true;
        if (nums.length == 1) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            if (memo[i]) {
                for (int j = i + 1; j <= i + nums[i]; j++) {
                    if (j >= nums.length - 1) {
                        return true;
                    }
                    memo[j] = true;
                }
            }
        }
        return false;
    }
}
