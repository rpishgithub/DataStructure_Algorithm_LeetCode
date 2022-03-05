package tech.rpish;

import java.util.HashSet;

public class FrequentUsedOperations {
    public static void main(String[] args) {
//        1.Create a HashSet
        HashSet<Integer> set = new HashSet<>();

//        2.Add Element O(1)
        set.add(1);
        set.add(3);
        set.add(5);

//        3.Search Element O(1)
        set.contains(3);

//      4.Delete Element O(1)
        set.remove(5);

//        5.Get Size O(1)
        set.size();



    }
}
