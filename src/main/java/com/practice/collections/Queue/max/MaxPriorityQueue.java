package com.practice.collections.Queue.max;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        pq.forEach((Integer a)->System.out.println(a));







    }
}
