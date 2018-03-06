package Beel;

import java.util.Arrays;

public class pre4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 4 };
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {

				index = i;
				break;
			}
		}
		int[] array = new int[index];
		for (int i = 0; i < index; i++) {
			array[i] = nums[i];

		}

		System.out.println(index);
		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
	}

}
