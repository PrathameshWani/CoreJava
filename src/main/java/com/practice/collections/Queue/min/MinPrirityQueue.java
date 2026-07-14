package com.practice.collections.Queue.min;

import java.util.PriorityQueue;

public class MinPrirityQueue {
    public static void main(String args[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(4);


        pq.forEach((Integer e) -> System.out.println(e));

        while(!pq.isEmpty()){
            System.out.println("Remove From Top : "+pq.poll());
        }


    }
}
