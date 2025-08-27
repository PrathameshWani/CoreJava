package com.practice.LeetCode;

import java.lang.reflect.Array;

public class LC_151_ReverseWordsInAString {

	public String reverseWords(String s) {
		s = s.trim();
		String[] words = s.split("\\s+");
		StringBuilder sb = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i > 0)
				sb.append(" ");
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC_151_ReverseWordsInAString s = new LC_151_ReverseWordsInAString();
		System.out.println(s.reverseWords("  hello world  "));

	}

}
