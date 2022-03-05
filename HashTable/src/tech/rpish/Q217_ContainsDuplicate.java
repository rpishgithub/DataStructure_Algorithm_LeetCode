package tech.rpish;

import java.util.HashMap;

public class Q217_ContainsDuplicate {
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                return true;
            }
            hashMap.put(num, 1);
        }
        return false;
    }
}
