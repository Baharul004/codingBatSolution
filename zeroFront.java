package Beel;

import java.util.Arrays;

public class zeroFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 1, 51, 0, 10 };
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				nums[i] = nums[count];
				nums[count] = 0;
				count++;

			}
		}

		System.out.println(count);

		System.out.println(Arrays.toString(nums));

	}

}
