package Beel;

import java.util.Arrays;

public class evenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 13, 13, 2, 4, 3, 2, 25 };
		int count = 0;
		int oddcount = nums.length - 1;
		int[] array = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				array[count] = nums[i];

				count++;

			} else {
				if (nums[i] % 2 != 0) {

					array[oddcount] = nums[i];
					oddcount--;
				}
			}
		}

		System.out.println(Arrays.toString(array));

	}

}
