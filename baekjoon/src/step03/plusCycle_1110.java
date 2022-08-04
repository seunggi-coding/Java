package step03;

import java.util.Scanner;

public class plusCycle_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int num = n;
		
		while(true) {
			String str = "";
			str += num%10;
			str += ((num/10) + (num%10))%10;
			
			num = Integer.parseInt(str);
			count++;
			
			if(num == n) {
				System.out.println(count);
				break;
			}
		}
		scan.close();
	}

}
