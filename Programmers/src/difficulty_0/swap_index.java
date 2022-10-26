package difficulty_0;

public class swap_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love you";
		int num1 = 3;
		int num2 = 6;
		
		System.out.println(solution(str, num1, num2));
	}

	public static String solution(String my_string, int num1, int num2) {
		String answer = "";
		char[] arr = my_string.toCharArray();
		char tmp = ' ';
		
		for(int i = 0; i < arr.length; i++) {
			if(i == num1) {
				tmp = arr[i];
				arr[i] = arr[num2];
				arr[num2] = tmp;
			}
		}
		answer = String.copyValueOf(arr);
		
		return answer;
	}
}
