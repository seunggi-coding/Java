package difficulty_0;

public class number_dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] box = {10, 8, 6};
		int n = 3;
		
		System.out.println(solution(box, n));
	}

	public static int solution(int[] box, int n) {
		int answer = 1;
		
		for(int i = 0; i < box.length; i++) {
			answer *= box[i]/n;
		}
		
		return answer;
	}
}
