package step03;

import java.util.Scanner;

public class printStar_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		scan.close();
	}

}
