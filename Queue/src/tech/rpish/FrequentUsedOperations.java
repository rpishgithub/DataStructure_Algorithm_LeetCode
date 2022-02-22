package tech.rpish;

import java.util.LinkedList;
import java.util.Queue;

//FIFO
//Access O(N)
//Search O(N)
//Insert/peek O(1)
//Remove/poll O(1)
public class FrequentUsedOperations {
    public static void main(String[] args) {
//        1.Create
        Queue<Integer> queue = new LinkedList<>();

//        2.Add Element O(1)
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.toString());

//        3.Get the head of the queue O(1)
        int tmp1 = queue.peek();
        System.out.println(tmp1);
        System.out.println(queue.toString());

//        4.Remove the head of queue O(1)
        int tmp2 = queue.poll();
        System.out.println(tmp2);
        System.out.println(queue.toString());

//        5.The length of the queue O(1)
        System.out.println(queue.size());

//        6.Check whether the queue is empty O(1)
        System.out.println(queue.isEmpty());

//        7.Traverse O(N)
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            System.out.println(temp);
        }

    }


}
