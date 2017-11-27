package first;
import java.util.*;
public class nextline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// both are correct
		Scanner s = new Scanner(System.in);
//		int c = 1;
//		for(int i = 0; i<c ; i++) {
//			String sN = s.nextLine();
//			System.out.println(c + "-> " + sN);
//			c++;
//		}
		int count = 1;

        while(s.hasNext()) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;
        }
		

	}

}
