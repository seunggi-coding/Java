package step02;

import java.util.Scanner;

public class quardrantN_14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.nextLine());
		int y = Integer.parseInt(scan.nextLine());
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		} else if(x > 0 && y < 0) {
			System.out.println("4");
		} else if(x < 0 && y > 0) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
	
		scan.close();
	}

}
