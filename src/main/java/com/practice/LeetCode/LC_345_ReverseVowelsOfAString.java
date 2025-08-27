package com.practice.LeetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC_345_ReverseVowelsOfAString {
	/*
	 * Input: s = "leetcode" 
	 * Output: "leotcede"
	 */
    
    public String reverseVowels(String s) {
    	List<Character> vowels = new ArrayList<>();
        List<Integer> indexex = new ArrayList<>();
    	char [] breaks = s.toCharArray();
    	for(int i = 0; i<breaks.length ; i++) {
    		if(breaks[i] == 'a' || breaks[i] == 'A' || breaks[i] == 'e' || breaks[i] == 'E' || breaks[i] == 'i' || breaks[i] == 'I' 
    				|| breaks[i] == 'o' || breaks[i] == 'O' || breaks[i] == 'u' || breaks[i] == 'U' ) {
    			
    			vowels.add(breaks[i]);
    			indexex.add(i);
    			
    		}
    	}
    	
    	Collections.reverse(vowels);
    /*	StringBuilder finalString = new StringBuilder();
    	for(int i = 0; i< breaks.length; i++) {
    		if(indexex.contains(i)) {
    			int ind = indexex.indexOf(i);
    			finalString.append(vowels.get(ind));
    		}else {
    			finalString.append(breaks[i]);
    		}
    	}
   */
        for (int j = 0; j < indexex.size(); j++) {
            breaks[indexex.get(j)] = vowels.get(j);
        }
        
        return new String(breaks);
    	
        //return finalString.toString();
    }
	
	
	

	public static void main(String[] args) {
		LC_345_ReverseVowelsOfAString s = new LC_345_ReverseVowelsOfAString();
		
		String a = s.reverseVowels("");
		
		System.out.println(a);
	}

}
