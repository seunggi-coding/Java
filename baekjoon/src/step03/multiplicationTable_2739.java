package step03;

import java.util.Scanner;

public class multiplicationTable_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = "  + num*i);
		}
		
		scan.close();
	}

}
