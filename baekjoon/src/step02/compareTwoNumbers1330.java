package step02;

import java.util.Scanner;

public class compareTwoNumbers1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int A, B = 0;
		A = scan.nextInt();
		B = scan.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else {
			System.out.println("=");
		}
		scan.close();
	}

}
