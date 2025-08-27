package com.practice.LeetCode;

public class LC_334_Increasing_Triplet_Subsequence {

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC_334_Increasing_Triplet_Subsequence s = new LC_334_Increasing_Triplet_Subsequence();
		int nums[] = {20,200,10,12,5,13};
		System.out.println(s.increasingTriplet(nums));

	}

}
