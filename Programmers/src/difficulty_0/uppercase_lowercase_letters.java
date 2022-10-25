package difficulty_0;

public class uppercase_lowercase_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abCdEfghIJ";
	
		System.out.println(solution(str));
		
	}

	public static String solution(String my_string) {
		//문자열을 char 배열로 바꾸고 각각의 배열의 요소가 대문자면 소문자로
		//소문자면 대문자로 변경하여 다시 문자열로 만들어 반환
		char answer[] = my_string.toCharArray();
		String result = "";
		
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] >= 65 && answer[i] <= 90) {
				answer[i] += 32;
			} else if(answer[i] >= 97 && answer[i] <= 122) {
				answer[i] -= 32;
			}
		}
		result = String.copyValueOf(answer);
		
		return result;
	}
}
