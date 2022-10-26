package difficulty_0;

public class rock_scissors_paper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rsp = "205";
		
		System.out.println(solution(rsp));
	}

	public static String solution(String rsp) {
		String answer = "";
		char[] arr = rsp.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
//			Character.forDigit(바꿀 숫자, 10진수인지 16진수인지);
			if(arr[i] == Character.forDigit(2, 10)) {
				answer += 0;
			} else if(arr[i] == Character.forDigit(0, 10)) {
				answer += 5;
			} else if(arr[i] == Character.forDigit(5, 10)) {
				answer += 2;
			}
		}
		
		return answer;
	}
}
