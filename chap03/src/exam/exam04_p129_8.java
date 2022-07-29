package exam;

public class exam04_p129_8 {

	public static void main(String[] args) {
		// 사다리꼴의 넓이를 구하는 코드 정확히 소수 자릿수가 나와야 함.
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		//사다리꼴의 넓이는 (밑변 + 윗변) * 높이 / 2
		double area = (lengthBottom + lengthTop) * height / 2.0;
		System.out.println(area);
	}

}
