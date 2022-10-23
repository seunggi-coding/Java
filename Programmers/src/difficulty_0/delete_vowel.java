package difficulty_0;

public class delete_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "nice to meet you";
		
		System.out.println(solution(my_string));
	}

	public static String solution(String my_string) {
		String answer = "";
		//String 변수명.replaceAll("대체할 문자열", "바꿀 문자열") 메소드를 통해
		//제거에도 사용할 수 있음
		answer = my_string.replace("a", "");
		answer = answer.replace("e", "");
		answer = answer.replace("i", "");
		answer = answer.replace("o", "");
		answer = answer.replace("u", "");
		
//		위의 5줄을 아래의 한 줄로 줄일 수 있다.
//		answer = my_string.replaceAll("[a,e,i,o,u]","");
		
		return answer;
	}
}
