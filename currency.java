package first;
import java.util.*;
import java.text.*;

public class currency {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale INDIA = new Locale("en","IN");
        //if(0 <= payment && payment <= Math.pow(10, 9)) {
        	NumberFormat us = NumberFormat.getInstance(Locale.US);
        	NumberFormat india = NumberFormat.getInstance(INDIA);
        	NumberFormat china = NumberFormat.getInstance(Locale.CHINA);
        	NumberFormat france = NumberFormat.getInstance(Locale.FRENCH);
       
        
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
      //  }
	}

}
