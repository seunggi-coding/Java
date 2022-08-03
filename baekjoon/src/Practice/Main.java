package Practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int num = scan.nextInt();
				
				for(int i=1; i<=num; i++) {
					int n1 = scan.nextInt();
					int n2 = scan.nextInt();
					System.out.println("Case #" + i + ": " + n1 + " + " + n2 + " = " + (n1+n2));
				}				
				scan.close();
			}
}
