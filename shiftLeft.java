package Beel;

import java.util.Arrays;

public class shiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 6, 2, 5, 3 };
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {

			array[i] = nums[i + 1];
			array[nums.length - 1] = nums[0];

		}
		System.out.println(Arrays.toString(array));

	}

}
