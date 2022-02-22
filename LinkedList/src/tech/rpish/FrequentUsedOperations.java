package tech.rpish;

import java.util.LinkedList;

public class FrequentUsedOperations {
    public static void main(String[] args) {
//        1.Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

//        2.Add Element O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());

//        3. Insert Element O(N)
        list.add(2, 99);

//        4.Access Element O(N)
        int element = list.get(2);

//        5.Search Element O(N)
        int index = list.indexOf(99);

//        6.Update Element O(N)
        list.set(2, 88);

//        7.Remove Element O(N)-->Search&Remove
        list.remove(2);

//        8.Length O(1)
        int length = list.size();

    }
}
