package com.practice.LeetCode;

import java.awt.List;

class Solution {
	public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        // Merge characters alternately
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        // Append remaining characters (if any)
        while (i < word1.length()) {
            result.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            result.append(word2.charAt(j++));
        }

        return result.toString();
    }
}


public class LC_1768_MergeStringAlternately {

	public static void main(String[] args) {
	
		Solution a = new Solution();
		System.out.println(a.mergeAlternately("abc", "bxjdjkagksdj"));
	}
	
	
		

}
