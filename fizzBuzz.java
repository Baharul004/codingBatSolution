package Beel;

import java.util.Arrays;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int end = 5;
		int len = end - start;
		String[] array = new String[len];

		for (int i = start; i < end; i++) {
			if (i % 3 == 0) {
				String x = Integer.toString(i);
				x = "Fizz";
				array[i - start] = x;
				// System.out.println(i);

			} else if (i % 5 == 0) {
				String x = Integer.toString(i);
				x = "Buzz";
				array[i - start] = x;
				System.out.println(x);
			} else {
				String x = Integer.toString(i);
				array[i - start] = x;
				// System.out.println(x);
			}

		}
		System.out.println(Arrays.toString(array));

	}

}
