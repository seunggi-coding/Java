package difficulty_0;

public class array_element_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"We", "are", "the", "world!"};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(solution(arr)[i]);
		}
	}

	public static int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		
		for(int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		
		return answer;
	}
}
