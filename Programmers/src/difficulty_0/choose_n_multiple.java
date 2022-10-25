package difficulty_0;

import java.util.Arrays;

public class choose_n_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int[] numlist = { 2, 100, 120, 600, 12, 12 };

		System.out.println(Arrays.toString(solution(n, numlist)));
	}

	public static int[] solution(int n, int[] numlist) {
		int count = 0;
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				count++;
			}
		}
		int[] answer = new int[count];
		int j = 0;
		for (int i = 0; i < numlist.length; i++) {
			if (j == answer.length) {
				break;
			}
			if (numlist[i] % n == 0) {
				answer[j++] = numlist[i];
			}
		}

		return answer;
	}
}
