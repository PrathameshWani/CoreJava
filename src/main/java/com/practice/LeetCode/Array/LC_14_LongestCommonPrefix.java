package com.practice.LeetCode.Array;

import java.util.Arrays;

public class LC_14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        for(int i = 1; i< strs.length ; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty()) return "";
            }
        }


        return prefix;
    }


    public static void main(String[] args){
        LC_14_LongestCommonPrefix a = new LC_14_LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(a.longestCommonPrefix(strs));



    }
}
