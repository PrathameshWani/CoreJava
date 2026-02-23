package com.practice.LeetCode.Array;

public class LC_26_RemoveDuplicateFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int count = 0 ;

        for(int i = 0; i < nums.length -1 ; i ++){
            for(int j = 1; j < nums.length; j++){
                if(i == j ) continue;
                if(nums[i] == nums[j]){

                }
            }
        }



        return count;
    }




    public static void main(String args[]){

        LC_26_RemoveDuplicateFromSortedArray a = new LC_26_RemoveDuplicateFromSortedArray();
        int[] b = {0,0,1,1,2,2,2,2};
        System.out.println(a.removeDuplicates(b));
    }
}
