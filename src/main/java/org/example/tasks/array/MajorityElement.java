package org.example.tasks.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            Integer current = counts.getOrDefault(num, 0);
            counts.put(num, current+1);
        }
        return counts.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(0);
    }
}
