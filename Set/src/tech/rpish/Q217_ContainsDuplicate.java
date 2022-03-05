package tech.rpish;

import java.util.HashSet;

public class Q217_ContainsDuplicate {
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        if (nums.length == set.size()) {
//            return true;
//        } else {
//            return false;
//        }
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
