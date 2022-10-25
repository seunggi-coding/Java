package difficulty_0;

public class specific_char_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "BCBdbe";
		String letter = "B";
		
		System.out.println(solution(my_string, letter));
	}

	public static String solution(String my_string, String letter) {
		String answer = "";
		char[] arr = new char[my_string.length()];
		char txt = letter.charAt(0);
		arr = my_string.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != txt) {
				answer += arr[i];
			}
		}
		
		return answer;
	}
}
