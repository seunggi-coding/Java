package Practice;

import java.util.Scanner;

public class smallX_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
			
			if(num[i] < x) {
				System.out.print(num[i] + " ");
			}
		}
		scan.close();
	}

}
