
// finding sum of squares of number form 1 to n

import java.util.Scanner;
public class sum_square {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int sum = 0;
	for(int i = 1;i<=a;i++) {
		sum += i*i;
	}
	System.out.println(+ sum);
	sc.close();
}
}
