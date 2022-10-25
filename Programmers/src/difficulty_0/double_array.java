package difficulty_0;

import java.util.Arrays;

public class double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 100, -99, 1, 2, 3};
		
		System.out.println(Arrays.toString(solution(arr)));
		
	}

	public static int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i]*2;
		}
		return answer;
	}
}
