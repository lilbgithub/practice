package leetcode;

import java.util.HashMap;

public class MinWIndowSubstring {
    public static String solution(String s1, String s2) {
        String ans = "";
        HashMap<Character, Integer> s2FreqMap = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            s2FreqMap.put(ch, s2FreqMap.getOrDefault(ch, 0) + 1);
        }
        int matchCount = 0;
        int desiredMatchCount = s2.length();

        HashMap<Character, Integer> s1FreqMap = new HashMap<>();

        int i = -1;
        int j = -1;

        while (true) {
            boolean f1 = false;
            boolean f2 = false;
            //acquire
            while (i < s1.length() && matchCount < desiredMatchCount) {
                i++;
                char ch = s1.charAt(i);
                s2FreqMap.put(ch, s2FreqMap.getOrDefault(ch, 0) + 1);

                if (s2FreqMap.getOrDefault(ch, 0) <= s1FreqMap.getOrDefault(ch, 0)) {
                    matchCount++;
                }
                f1 =true;
            }
            //collect ans and release
            while (j < i && matchCount == desiredMatchCount) {
                String pAns = s1.substring(j + 1, i + 1);
                if (pAns.length() == 0 || pAns.length() < ans.length()) {
                    ans = pAns;
                }
                j++;
                char ch = s1.charAt(j);
                if (s1FreqMap.get(ch) == 1) {
                    s1FreqMap.remove(ch);
                } else {
                    s1FreqMap.put(ch, s1FreqMap.get(ch) - 1);
                }

                if (s2FreqMap.getOrDefault(ch, 0) < s2FreqMap.getOrDefault(ch, 0)) {
                    matchCount--;
                }
                f2 =true;
            }
            if (f1 == false && f2 == false) {
                break;
            }
        }
        return ans;
    }

}
