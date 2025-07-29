
// convert temperature from Fahrenheit (°F) to Celsius (°C)

import java.util.Scanner;
public class f_to_c {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	float c = (5*(a-32))/9;
	System.out.println("Celsius (°C) " +c);
}
}
