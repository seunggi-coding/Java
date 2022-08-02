package step02;

import java.util.Scanner;

public class ovenClock_2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		int ovenM = scan.nextInt();
		int sum = H*60 + M + ovenM;
		
		H = sum / 60;
		M = sum % 60;
		
		if(H >= 24) {
			System.out.println((H-24) + " " + M);
		} else {
			System.out.println(H + " " + M);
		}
		
				
		scan.close();
	}

}
