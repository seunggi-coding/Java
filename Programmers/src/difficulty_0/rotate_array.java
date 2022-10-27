package difficulty_0;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(solution(numbers, direction)[i]);
		}
	}

	public static int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		
		if(direction.equals("left")) {
			System.arraycopy(numbers, 1, answer, 0, numbers.length-1);
			answer[answer.length-1] = numbers[0];
		} else if(direction.equals("right")) {
			System.arraycopy(numbers, 0, answer, 1, numbers.length-1);
			answer[0] = numbers[numbers.length-1];
		}
		
		return answer;
	}
}
