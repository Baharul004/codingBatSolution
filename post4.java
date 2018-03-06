package Beel;

import java.util.Arrays;

public class post4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 4, 1, 2 };
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {

				index = i;

			}
		}
		int len = index + 1;
		int[] array = new int[nums.length - len];
		for (int i = len; i < nums.length; i++) {
			array[i - len] = nums[i];

		}

		System.out.println(len);
		System.out.println(Arrays.toString(array));
		System.out.println(array.length);

	}

}
