package Beel;

public class codHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xxggyygxx";
		int xgg = 0;
		int ygg = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			char g = str.charAt(i);
			char gg = str.charAt(i + 1);
			if (g == 'g' && gg == 'g') {
				int index = str.indexOf(gg);
				for (int j = index + 2; j < str.length(); j++) {

				}
				System.out.println(index + 2);
			}

		}
		// System.out.println(xgg);
		// System.out.println(ygg);

	}

}
