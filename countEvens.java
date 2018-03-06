package Beel;

public class countEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2, 1, 2, 3, 4, 6 };
		int result = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				result++;
		}
		System.out.println(result);
	}

}
