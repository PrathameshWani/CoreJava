package com.practice.LeetCode;

public class LC_334_Increasing_Triplet_Subsequence {
	
    public boolean increasingTriplet(int[] nums) {
    	
    	// [20,200,10,12,5,13]     Its true. Triplet is [10,12,13]
    	boolean flag = false;
    	int secondIndex = getSecondNo(nums);
    	while( -1 == getSecondNo(nums)) {
    		
    	}
    	
    	return flag;

    }
	
    public int getSecondNo(int[] nums) {
        for(int i = 0; i< nums.length - 1 ; i++) {
        	if(nums[i] < nums[i+1]) {
        		return i+1;
        	}
        }
		return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC_334_Increasing_Triplet_Subsequence s = new LC_334_Increasing_Triplet_Subsequence();
		int nums[] = {20,200,10,12,5,13};
		System.out.println(s.increasingTriplet(nums));

	}

}
