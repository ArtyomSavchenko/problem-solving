package org.example.tasks.array;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch2 = ransomNote.charAt(i);
            int newCount = counts.getOrDefault(ch2, 0) - 1;
            if (newCount < 0) {
                return false;
            }
            counts.put(ch2, newCount);
        };
        return true;
    }
}
