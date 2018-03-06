package Beel;

import java.util.Arrays;

public class fizzArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 11, 18 };
		int dif = Math.abs(11 - 18);
		int[] array = new int[dif];
		for (int i = 11; i < 11 + dif; i++) {
			array[i - 11] = i;
		}
		System.out.println(Arrays.toString(array));

	}

}
