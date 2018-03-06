package Beel;

import java.util.Arrays;

public class sum67final {
	public static void main(String[] args) {

		int[] nums = { 1, 6, 2, 2, 7, 1, 6, 99, 99, 7 }; // ans 18

		int indexSix = 0;
		int indexSeven = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				indexSix = i;

				for (int j = indexSix; j < nums.length; j++) {
					if (nums[j] == 7) {

						indexSeven = j;
						Arrays.fill(nums, indexSix, indexSeven + 1, 0);
						break;
					}
				}

			}

		}

		// for (int i = 0; i < nums.length; i++) {
		// Arrays.fill(nums, indexSix, indexSeven + 1, 0);
		// }
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

		}
		// System.out.println(sum);
		System.out.println(Arrays.toString(nums));
		System.out.println(indexSix);
		System.out.println(indexSeven);
	}

}
