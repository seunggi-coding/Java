package Practice;

import java.util.Scanner;

public class printStar2_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
					
		for(int i=1; i<=num; i++) {
			for(int k=1; k<=num-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
				
		scan.close();
	}
}
