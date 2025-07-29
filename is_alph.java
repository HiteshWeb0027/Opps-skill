
// checking character is alphabet or not 

import java.util.Scanner;
public class is_alph {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	char ch = sc.next().charAt(0);
	
	if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')) {
		System.out.println("It is alphabet");
	}else {
		System.out.println("Not alphabet");
	}
	sc.close();
}
}
