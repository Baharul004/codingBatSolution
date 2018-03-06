package Beel;

public class CharacterDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aa11b33";
		int sum = 0;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i)) == true) {
				int a = Integer.parseInt(String.valueOf(str.charAt(i)));
				// int a = Character.getNumericValue(str.charAt(i));
				sum += a;

			}

		}
		System.out.println(sum);

	}

}
