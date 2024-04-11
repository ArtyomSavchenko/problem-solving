package org.example.tasks.string;

public class LastWord {
    public int lengthOfLastWord(String s) {
        int st = 0;
        if (s.isEmpty()) {
            return 0;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (st >= i) {
                    return st - i;
                }
            } else if (st == 0) {
                st = i;
            }
        }
        return st + 1;
    }
}
