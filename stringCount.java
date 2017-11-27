package first;
import java.util.*;
public class stringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		String b = sc.nextLine();
//		int counta = 0;
//		int countb = 0;
//		for(int i =0; i<a.length(); i++) {
//			counta++;
//		}
//		for(int j =0; j<a.length(); j++) {
//			countb++;
//		}
//		int z = counta + countb ;
//		System.out.println("Total number = "+ z);
//		if(counta > countb) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
//		
//		System.out.println("Text = "+ a +" " + b);
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		System.out.println(A.compareTo(B)>0?"Yes":"No");
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "
		+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));

	}

}
