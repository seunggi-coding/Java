package difficulty_0;

public class theAge_exoplanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 23;
		
		System.out.println(solution(age));
	}

	public static String solution(int age) {
		String answer = "";
		char[] s = String.valueOf(age).toCharArray();
		char[] result = new char[s.length];
		
//		char형 0~9에 49를 더하면 char형 소문자가 나온다
		for(int i = 0; i < s.length; i++) {
			result[i] += (s[i] + 49);
		}
		answer = String.copyValueOf(result);
		
		return answer;
	}
}
