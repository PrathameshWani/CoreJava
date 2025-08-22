package com.practice.LeetCode;

import java.lang.reflect.Array;

public class LC_1_TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		int arr_size = nums.length;

		for (int i = 0; i < arr_size; i++) {
			for (int j = i + 1; j < arr_size; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	 public static void main(String args[]){
	        int[] nums = {2,7,11,15};
	        int target = 9;
	        LC_1_TwoSum s = new LC_1_TwoSum();
	        System.out.println(s.twoSum(nums,target));

	    }

}
