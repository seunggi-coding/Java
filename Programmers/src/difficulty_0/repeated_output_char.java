package difficulty_0;

public class repeated_output_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "hello";
		int n = 3;
		
		System.out.println(solution(my_string, n));
	}

	public static String solution(String my_string, int n) {
		String answer = "";
		char[] answer2 = new char[my_string.length()*3];
		
		int j = 0;
		for(int i = 0; i < answer2.length; i++) {
			if(j < 3) {
				for(int k=0; k < 3; k++) {
					answer2[i] = my_string.charAt(i);					
					j++;
				}
			} else {
				j = 0;
			}
		}
		
		answer = String.copyValueOf(answer2);
		
		return answer;
	}
}
