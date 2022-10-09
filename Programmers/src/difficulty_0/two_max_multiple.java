package difficulty_0;

import java.util.*;

public class two_max_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {0, 31, 24, 10, 1, 9};
		
		System.out.println(solution(numbers));
	}
	public static int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}
