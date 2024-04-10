package org.example.tasks.array;

import java.util.Arrays;

public class JumpGame2 {
    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, Integer.MAX_VALUE);
        memo[0] = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int cj = memo[i];
            int end = Math.min(i + nums[i] + 1, nums.length);
            for (int j = i; j < end; j++) {
                if (memo[j] > cj + 1) {
                    memo[j] = cj + 1;
                }
            }
        }
        return memo[nums.length - 1];
    }
}
