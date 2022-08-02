package step02;

import java.util.Scanner;

public class alarmClock_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M >= 45) {
			System.out.print(H + " " + (M-45));
		} else {
			if(H != 0) {
				System.out.print((H-1) + " " + (60 + (M-45)));
			} else {
				System.out.print("23 " + (60 + (M-45)));
			}
			
		}
		
		scan.close();
	}

}
