package step02;

import java.util.Scanner;

public class ThreeDice_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		int s = scan.nextInt();
		int t = scan.nextInt();
		int big = 0;
	
		big = Math.max(Math.max(f, s), t);
		
		if(f == s && f == t && s == t) {
			System.out.println(10000 + f*1000);
		} else if(f == s || f == t || s == t) {
			if(f == s) {
				System.out.println(1000 + f*100);
			} else if(f == t) {
				System.out.println(1000 + f*100);
			} else if(s == t) {
				System.out.println(1000 + s*100);
			}
		} else if(f != s && f != t && s != t) {
			System.out.println(big * 100);
		}
		
		scan.close();
	}	

}
