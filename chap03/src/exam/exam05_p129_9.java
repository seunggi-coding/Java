package exam;

import java.util.Scanner;

public class exam05_p129_9 {

	public static void main(String[] args) {
		// 키보드로 두 실수를 입력받는다. (Scanner 이용)\
		// 입력된 첫 번째 수에 두 번째 수를 나눈 결과를 "결과:값"으로 출력하되, 
		// 두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 코드를 작성. (Scanner의 next() 사용)
		Scanner scanner = new Scanner(System.in);
		double first;
		double second;
		
		System.out.print("첫 번째 수: ");
		first = Double.parseDouble(scanner.next());
		
		System.out.print("두 번째 수: ");
		second = Double.parseDouble(scanner.next());
		System.out.println("---------------");
		System.out.print("결과: ");
		if(second != 0.0) {
			System.out.println(first / second);
		} else {
			System.out.println("무한대");
		}
		
		scanner.close();
	}

}
