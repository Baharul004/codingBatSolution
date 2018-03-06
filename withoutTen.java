package Beel;

import java.util.Arrays;

public class withoutTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 10, 13, 10, 14, 10 };
		int count = 0;
		int coun = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				nums[count] = nums[i];
				// break;
				count++;

			}

		}
		System.out.println(count);
		for (int i = count; i < nums.length; i++) {
			// nums[i] = 0;

		}
		System.out.println(Arrays.toString(nums));

	}

}
