package com.practice.LeetCode;

public class LC_704_BinarySearch {

    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[]){
        LC_704_BinarySearch a = new LC_704_BinarySearch();
        System.out.println(a.search(new int[]{1,2,3,4,5,6,7,8,9,10}, 9));
    }
}
