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
		char[] new_arr = new char[my_string.length()*n];
		
		new_arr = my_string.toCharArray();
		
		for(int i = 0; i < new_arr.length; i++) {
			System.out.println(new_arr[i]);
		}
		
		return answer;
	}
}
