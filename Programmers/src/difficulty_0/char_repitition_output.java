package difficulty_0;

public class char_repitition_output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		int n = 3;

		System.out.println(solution(str, n));
	}

	public static String solution(String my_string, int n) {
		String answer = "";
		char[] new_arr = my_string.toCharArray();
		char[] result = new char[new_arr.length * n];

		int j = 0;
		for (int i = 0; i < result.length; i++) {
			result[i] = new_arr[j];
			if ((i + 1) % n == 0) {
				j++;
			}

		}

		answer = String.copyValueOf(result);

		return answer;
	}
}
