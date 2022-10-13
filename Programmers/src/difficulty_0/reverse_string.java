package difficulty_0;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "bread";

		System.out.println(solution(my_string));
	}

	public static String solution(String my_string) {
		String answer = "";

		for (int i = my_string.length() - 1; i >= 0; i--) {
			answer = answer + my_string.charAt(i);
		}

		return answer;
	}
}
