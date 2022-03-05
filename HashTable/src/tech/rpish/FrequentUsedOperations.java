package tech.rpish;

import java.util.HashMap;

//key-value pair
//Array is a special HashTable
public class FrequentUsedOperations {
    public static void main(String[] args) {
//        1.Create Hash Table
//        1.1 Create Hash Table by Array
        String[] hashTable = new String[4];
//        1.2 Create Hash Table By HashMap
        HashMap<Integer, String> map = new HashMap<>();

//        2.Add Element
//        Time Complexity:O(1)
        hashTable[1] = "lilei";
        hashTable[2] = "hanmeimei";
        map.put(1, "lilei");
        map.put(2, "hanmeimei");

//        3.Update Element
//        Time Complexity:O(1)
        hashTable[1] = "jack";
        map.put(1, "jack");

//        4.Remove Element
//        Time Complexity:O(1)
        hashTable[1] = "";
        map.remove(1);

//        5.Get Value
//        Time Complexity:O(1)
        String temp = hashTable[2];
        map.get(2);

//        6.Check key
//        Time Complexity:O(1)
        map.containsKey(2);

//        7.Length
//        Time Complexity:O(1)
        map.size();

//        8.Is Empty?
//        Time Complexity:O(1)
        map.isEmpty();

    }
}
