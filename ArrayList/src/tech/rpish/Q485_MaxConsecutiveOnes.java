package tech.rpish;
//485. Max Consecutive Ones
//        Given a binary array nums, return the maximum number of consecutive 1's in the array.
//
//
//
//        Example 1:
//
//        Input: nums = [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
//        Example 2:
//
//        Input: nums = [1,0,1,1,0,1]
//        Output: 2
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        nums[i] is either 0 or 1.
public class Q485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(solution(nums));

    }

    public static int solution(int nums[]) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int counter = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                max = Math.max(counter, max);
                counter = 0;
            }
        }
        return Math.max(counter,max);
    }

}
