package difficulty_0;

public class cut_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 2, 3, 4, 5 };
		int num1 = 1;
		int num2 = 3;

		for (int i = 0; i < num2; i++) {
			System.out.println(solution(numbers, num1, num2)[i]);
		}
	}

	public static int[] solution(int[] numbers, int num1, int num2) {
//		a1, a2라는 정수가 있고 그 두 숫자 사이의 범위를 구할때는 a2-a1+1로 구한다
		int[] answer = new int[num2 - num1 + 1];

		int index = 0;
		for (int i = num1; i <= num2; i++) {
			answer[index] = numbers[i];
			index++;
		}

		return answer;
	}
}
