package difficulty_0;

public class sum_hidding_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "aAb1B2cC34oOp";

		System.out.println(solution(my_string));
	}

	public static int solution(String my_string) {
		int answer = 0;
		char[] arr = my_string.toCharArray();
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 48 && arr[i] <= 57) {
				n = arr[i];

//				문자 n을 숫자로 변환시켜준다.
				answer += Character.getNumericValue(n);
			}
		}

		return answer;
	}
}
