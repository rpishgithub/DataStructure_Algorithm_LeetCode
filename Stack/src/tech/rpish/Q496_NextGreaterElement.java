package tech.rpish;

import java.util.Stack;

public class Q496_NextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4, 1, 2};
        int[] num2 = {1, 3, 4, 2};
        int[] ans = Solution.nextGreaterElement(num1, num2);
        for (int an : ans) {
            System.out.printf("%s ", an);
        }
    }
}
class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        for (int i : nums2) {
            stack.push(i);
        }

        for (int i = 0; i < nums1.length; i++) {
            boolean isFound = false;
            int max = -1;
            while (!stack.empty()&& !isFound) {
                int temp = stack.pop();
                tempStack.push(temp);
                if (temp > nums1[i]) {
                    max = temp;
                }
                else if (temp == nums1[i]) {
                    isFound = true;
                }
            }
            ans[i] = max;
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }

        return ans;
    }
}