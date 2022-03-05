package tech.rpish;

import java.util.HashMap;

public class Q389_FindTheDifference {
}
class Solution1 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }
        for (Character character : tMap.keySet()) {
            if (!sMap.containsKey(character)) {
                return character;
            }
            if (sMap.get(character) < tMap.get(character)) {
                return character;
            }
        }
        return ' ';
    }
}
