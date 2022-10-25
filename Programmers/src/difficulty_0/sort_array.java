package difficulty_0;

import java.util.Arrays;

public class sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr = "p2o4i8gj2";

		for(int i = 0; i < solution(arr).length; i++) {
			System.out.println(solution(arr)[i]);
		}
	}

	public static int[] solution(String my_string) {
		int[] answer = null;
		String result = "";
		int count = 0;
		
		for (int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
			// 48은 아스키코드에서 0을 57은 9를 의미함.
			if (48 <= ch && ch <= 57) {
				count++;
			}
		}
		
		answer = new int[count];
		int j = 0;
		for (int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
			// 48은 아스키코드에서 0을 57은 9를 의미함.
			if (48 <= ch && ch <= 57) {
				while(j < count) {					
					answer[j] = Character.getNumericValue(ch);
					j++;
					break;
				}
			}
		}
		Arrays.sort(answer);
		
		return answer;
	}
}
