package difficulty_0;

public class triangle_complete_conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sides = {199, 72, 222};
		
		System.out.println(solution(sides));
	}

	public static int solution(int[] sides) {
		int answer = 0;
		int max = sides[0];
		int sum = 0;
		for(int i = 0; i < sides.length; i++) {
			if(max < sides[i]) {
				max = sides[i];
			} else {
				sum += sides[i];
			}
		}
		for(int j = 0; j < sides.length; j++) {
			if(max < sum) {
				answer = 1;
			} else {
				answer = 2;
			}
		}
		
		
		return answer;
	}
}
