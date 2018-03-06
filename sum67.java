package Beel;

import java.util.Arrays;

public class sum67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 11, 1, 6, 2 };
		// int[] numss = new int[nums.length];
		int index = 0;
		int sum = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && nums[i + 1] == 7) {
				nums[i] = 0;
				nums[i + 1] = 0;

			} else {
				if (nums[i] == 6) {
					index = i;
					System.out.println(index);
					Arrays.fill(nums, index, nums.length, 0);

				}
			}

		}
		System.out.println(Arrays.toString(nums));
		// System.out.println(Arrays.toString(numss));

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

		}
		System.out.println(sum);

	}

}
