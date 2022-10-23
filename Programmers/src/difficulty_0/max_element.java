package difficulty_0;

public class max_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 10, 11, 8};
		
		System.out.printf("[%d, %d]", solution(arr)[0], solution(arr)[1]);
	}

	public static int[] solution(int[] array) {
		int[] answer = new int[2];
		answer[0] = array[0];
		for(int i = 0; i < array.length; i++) {
			if(answer[0] < array[i]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		
		return answer;
	}
}
