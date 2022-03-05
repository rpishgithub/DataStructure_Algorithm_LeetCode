package tech.rpish;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q496_NextGreaterElement {
}
class Solution2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                int temp = stack.pop();
                hashMap.put(temp, num);
            }
            stack.push(num);
        }
        while (!stack.isEmpty()) {
            hashMap.put(stack.pop(), -1);
        }
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = hashMap.get(nums1[i]);
        }
        return ans;
    }
}
