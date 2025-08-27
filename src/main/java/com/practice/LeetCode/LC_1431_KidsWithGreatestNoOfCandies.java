package com.practice.LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LC_1431_KidsWithGreatestNoOfCandies {
	/*
	 * Input: candies = [2,3,5,1,3], extraCandies = 3 Output:
	 * [true,true,true,false,true]
	 */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestNo = 0;
        List<Boolean> list = new ArrayList<>();
        for(int a: candies) {
        	if(a >= greatestNo) {
        		greatestNo = a;	
        	}
        }
        
        for(int a: candies) {
        	if(a + extraCandies >= greatestNo) {
        		list.add(true);
        	}else {
        		list.add(false);
        	}
        }    	
    	
    	return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC_1431_KidsWithGreatestNoOfCandies s = new LC_1431_KidsWithGreatestNoOfCandies();
		int[] arr = {1,2,3,4,5};
		System.out.println(s.kidsWithCandies(arr,3));
		

	}

}
