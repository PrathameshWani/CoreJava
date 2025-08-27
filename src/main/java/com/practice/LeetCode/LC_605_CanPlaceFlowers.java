package com.practice.LeetCode;

public class LC_605_CanPlaceFlowers {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int counter = 0;
//        int i = 0;

		if (flowerbed.length > 1) {

			if (flowerbed[0] == 0 && flowerbed[1] == 0) {
				flowerbed[0] = 1;
				counter++;
			}

			for (int i = 1; i < flowerbed.length - 1; i++) {
				if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
					flowerbed[i] = 1;
					counter++;
					System.out.println("At index : " + i + " Value is : " + flowerbed[i]);
				}
			}

			if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
				flowerbed[flowerbed.length - 1] = 1;
				counter++;
			}
			
			if (counter >= n) {
				return true;
			}
			


		}else if(flowerbed[0] == 0) {
			counter ++;
		}
		
		
		if (counter >= n) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		LC_605_CanPlaceFlowers s = new LC_605_CanPlaceFlowers();
		int[] flowerbed = {0};
//						   0 1 2 3 4 5 6
		System.out.println(s.canPlaceFlowers(flowerbed, 1));

	}

}
