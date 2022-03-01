package tech.rpish;

import java.util.Stack;

//Stack FILO
//Access O(1)
//Search O(N)
//Insert/push O(1)
//Remove/pop O(1)
public class FrequentUsedOperations {
    public static void main(String[] args) {
//        1.Create
        Stack<Integer> stack = new Stack<>();

//        2.Add Element O(1)
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        3.Get the top of stack O(1)
        stack.peek();

//        4.Remove the top of stack O(1)
        int temp = stack.pop();

//        5.Stack Length O(1)
        stack.size();

//        6.Is the stack empty? O(1)
        stack.isEmpty();

//        7.Iterate a stack O(N)
        while (!stack.isEmpty()) {
            int num = stack.pop();
            System.out.println(num);
        }

    }
}
