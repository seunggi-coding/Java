package difficulty_0;

public class string_inner_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ppprrrogrammers";
		String str2 = "pppp";
		
		System.out.println(solution(str1, str2));
	}

	public static int solution(String str1, String str2) {
		int answer = 0;
		
//		String 변수명.indexOf(특정 문자열)	메소드는 특정 문자열이 존재하면 
//		해당 문자열의 첫 번째 인덱스가 반환되고 그렇지 않으면 -1이 반환된다.
		if(str1.indexOf(str2) >= 0) {
			answer = 1;
		} else {
			answer = 2;
		}
		return answer;
	}
}
