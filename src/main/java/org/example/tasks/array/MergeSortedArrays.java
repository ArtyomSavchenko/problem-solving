package org.example.tasks.array;

import java.util.LinkedList;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        LinkedList<Integer> remainingNums1 = new LinkedList<>();
        int counter2 = 0;

        for (int i = 0; i < m + n; i++) {
            int n2 = counter2 < n ? nums2[counter2] : Integer.MAX_VALUE;
            int n1 = i < m ? nums1[i] : Integer.MAX_VALUE;
            int n3 = !remainingNums1.isEmpty() ? remainingNums1.getFirst() : Integer.MAX_VALUE;
            if (n1 <= n2 && n1 <= n3) {
                continue;
            } else if (n2 <= n1 && n2 <= n3) {
                if (i < m) {
                    remainingNums1.add(nums1[i]);
                }
                nums1[i] = n2;
                counter2++;

            } else {
                if (i < m) {
                    remainingNums1.add(nums1[i]);
                }
                nums1[i] = n3;
                remainingNums1.removeFirst();
            }
        }
    }
}