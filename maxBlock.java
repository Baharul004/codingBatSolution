package Beel;

public class maxBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abbbbbcbbbbxbbbxxxxxx";
		int len = str.length();
		int count = 1;
		int max = 0;
		for (int i = 1; i < len; i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 1;
			}
			if (count > max) {
				max = count;
			}
		}

		System.out.println(max);
	}

}
