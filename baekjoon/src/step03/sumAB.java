package step03;

import java.util.Scanner;

public class sumAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num_total = scan.nextInt();
		
		for(int i=1; i<=num_total; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println(num1 + num2);
		}		
		
		scan.close();
	}

}
