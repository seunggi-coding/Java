package step03;

import java.util.Scanner;

public class whileSumAB_10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x, y;
		while(scan.hasNextInt()) {
			x = scan.nextInt();
			y = scan.nextInt();
			System.out.println(x+y);
		}
		scan.close();
		
	}

}
