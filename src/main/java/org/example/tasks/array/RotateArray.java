package org.example.tasks.array;

// O(N)
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || k ==0 || k % nums.length == 0) {
            return;
        }
        int iterationsCount = gcd(nums.length, k);
        for (int i = 0; i < iterationsCount; i++) {
            int currentPos = i;
            int prev = nums[currentPos];
            while (true) {
                int nextPos = (currentPos + k) % nums.length;
                int newPrev = nums[nextPos];
                nums[nextPos] = prev;
                prev = newPrev;
                if (nextPos == i) {
                    break;
                }
                currentPos = nextPos;
            }
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
