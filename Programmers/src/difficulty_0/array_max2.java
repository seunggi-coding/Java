package difficulty_0;

import java.util.Arrays;

public class array_max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, -3, 4, -5 };

		System.out.println(solution(arr));
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		int[] result = new int[numbers.length];

		System.arraycopy(numbers, 0, result, 0, result.length);

		int count = 0;
		int semi_result = 1;
		for (int i = 0; i < result.length; i++) {
			if (result[i] < 0) {
				count++;
			}
		}
		if (count % 2 == 0) {
			for (int i = 0; i < result.length; i++) {
				if (result[i] < 0) {
					semi_result *= result[i];
				}
			}
			Arrays.sort(result);
			if(semi_result > result[result.length - 1] * result[result.length - 2]) {
				answer = semi_result;
			} else {
				answer = result[result.length - 1] * result[result.length - 2];
			}
			
		} else {
			Arrays.sort(result);

			answer = result[result.length - 1] * result[result.length - 2];
		}

		return answer;
	}
}
