package Beel;

import java.util.Arrays;

public class tenRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 10, 3, 4, 20, 5 };

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] % 10 == 0 && nums[i + 1] % 10 != 0) {
				nums[i + 1] = nums[i];
			}

		}

		System.out.println(Arrays.toString(nums));

	}

}
