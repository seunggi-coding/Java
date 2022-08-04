package step03;

import java.util.Scanner;

public class whileSumAB_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x, y;
		while(true) {
			x = scan.nextInt();
			y = scan.nextInt();
			if(x == 0 && y == 0) {
				break;
			} else {
				System.out.println((x+y));
			}
		}
		scan.close();
		
	}

}
