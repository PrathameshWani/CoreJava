package com.practice.LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class LC_443_StringCompression {

    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        char c ;
        int counter = 1;
        for(int i = 0; i< chars.length; i++){
            for(int j = i+1; j <= i ; i++){
                if(chars[i] == chars[j]){
                    counter ++;
                    System.out.println("CHar is : "+ chars[i] + "Count : "+counter);
                }
            }
        }

        System.out.println(s.toString());









        return 0;

    }


     public static void main(String[] args){
         LC_443_StringCompression s = new LC_443_StringCompression();
         char[] a = {'a','a','b'};
         s.compress(a);

     }
}
