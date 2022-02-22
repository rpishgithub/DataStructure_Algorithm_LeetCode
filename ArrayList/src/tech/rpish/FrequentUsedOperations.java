package tech.rpish;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequentUsedOperations {
    public static void main(String[] args) {
//        1.Four Solutions to Create An Array
//        Take [1,2,3] as example
//        The previous three are given sized,the forth can extend easily
        int[] a = {1, 2, 3};
        int[] b = new int[]{1, 2, 3};
        int[] c = new int[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = i + 1;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        System.out.println(arr.toString());

//        2.Add Element
//        Time Complexity:O(1)
        arr.add(77);

//        3. Insert Element;
//        Time Complexity:O(N)
        arr.add(3, 88);

//        4.Access Element
//        TimeComplexity:O(1)
        int c1 = c[1];
        int arr1 = arr.get(1);

//        5.Update Element
//        TimeComplexity:O(1)
        c[1] = 11;
        arr.set(1, 11);

//        6.Remove Element
//        TimeComplexity:O(N)
        arr.remove(3);

//        7.The Length of An Array
//        TimeComplexity:O(1)
        int cSize = c.length;
        int arrSize = arr.size();

//        8.Iterate an Array
        for (int i = 0; i < c.length; i++) {
            int current = c[i];
            System.out.println("c at index "+i+": "+current);
        }

        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            System.out.println("c at index "+i+": "+current);
        }

//        9.Find an Element
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 99) {
                System.out.println("Found 99 in c");
            }
        }

        boolean isContain99 = arr.contains(99);
        System.out.println("Did we found 99 in arr?"+isContain99);

//        10.Sort
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        Collections.sort(arr);
        System.out.println(arr);

//        reverse order
        Collections.sort(arr,Collections.reverseOrder());
    }
}
