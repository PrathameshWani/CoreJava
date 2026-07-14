package com.practice.collections.Queue.comparator;

import java.util.Arrays;

public class Comparator {
    public static void main(String[] args) {

        Integer[] arr = {17,12,5,10,9};

        Arrays.sort(arr, (Integer val1, Integer val2) -> val1 * val2);
        Arrays.sort(arr);

        for(int a : arr){
            System.out.println(a);
        }
    }


}
