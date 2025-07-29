
// is given char is vowel or not

import java.util.Scanner;
public class is_vowel {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		System.out.println("It is vowel");
	}else {
		System.out.println("Not an vowel");
	}
}
}
