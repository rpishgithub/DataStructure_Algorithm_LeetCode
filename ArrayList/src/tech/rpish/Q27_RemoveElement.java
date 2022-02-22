package tech.rpish;

public class Q27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums,val));

    }
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int l = 0;
        int r = nums.length - 1;
        int temp;
        while (l < r) {
//            when left is val,stop
            while (l < r & nums[l] != val) {
                l++;
            }
//            when right is not val,stop
            while (l < r & nums[r] == val) {
                r--;
            }
//            swap
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        //in this case,r is val counter and l is the rest(non-val number)
        return nums[l] == val ? l : l + 1;
    }
}
