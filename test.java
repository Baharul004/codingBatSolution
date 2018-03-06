package Beel;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 1, 2, 3, 4 };
		int max = 0;
		int count = 0;
		ArrayList a = new ArrayList();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
				a.add(nums[i]);

				// int m = Math.max(nums[i], nums[i + 1]);
				// if (m > max)
				// max = m;
				// System.out.println(nums[i]);
				// break;
			}

		}
		System.out.println(a + " " + count);
		System.out.println(Arrays.toString(nums));
		String str = "isisnotno7Not";
		int is = 0;
		int are = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			String iss = str.substring(i, i + 2);

			if (iss.equals("is"))
				is++;

		}
		for (int i = 0; i < str.length() - 2; i++) {
			String ar = str.substring(i, i + 3);
			if (ar.equals("not"))
				are++;
		}

		System.out.println("Is is " + is);
		System.out.println("Are is " + are);
	}

}
