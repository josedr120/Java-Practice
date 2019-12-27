package Assigments6;

import java.util.*;

public class Practice5 {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(222, 555, 666, 333, 111, 888, 777, 444);
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(ints);
        System.out.println("Priority Queue => " + pq);
        System.out.println("Max element in the list => " + pq.peek());
        System.out.println("......................");
        // another way
        Queue<Integer> pq1 = new PriorityQueue<>((a, b) -> b - a);
        pq1.addAll(ints);
        System.out.println("Priority Queue => " + pq1);
        System.out.println("Max element in the list => " + pq1.peek());
        /* OUTPUT
          Priority Queue => [888, 444, 777, 333, 111, 555, 666, 222]
          Max element in the list => 888
          ......................
           Priority Queue => [888, 444, 777, 333, 111, 555, 666, 222]
           Max element in the list => 888

         */
    }
}
