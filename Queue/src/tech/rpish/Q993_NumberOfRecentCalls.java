package tech.rpish;

import java.util.LinkedList;
import java.util.Queue;

public class Q993_NumberOfRecentCalls {
}
class RecentCounter {
    int counter;
    Queue<Integer> queue = new LinkedList<>();

    public RecentCounter() {
        counter = 0;
    }

    public int ping(int t) {
        queue.add(t);
        counter++;
        while (queue.size()>0&&(t - queue.peek()) > 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
