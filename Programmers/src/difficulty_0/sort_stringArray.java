package difficulty_0;

public class sort_stringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Python";

		System.out.println(solution(str));
	}

	public static String solution(String my_string) {
		// 대문자는 65~90, 소문자는 97~122
		// 대문자는 +32, 소문자는 -32
		String answer = "";
		char[] str = my_string.toCharArray();
		for(int i = 0; i < str.length; i++) {
			if(str[i] >= 'A' && str[i] <= 'Z') {
				str[i] = (char)(str[i] + 32);
			}
		}
		char tmp = ' ';
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < i; j++) {
				if(str[i] < str[j]) {
					tmp = str[j];
					str[j] = str[i];
					str[i] = tmp;
				}
			}
		}
		answer = String.copyValueOf(str);
		
		return answer;
	}
}
