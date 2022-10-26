package difficulty_0;

public class three_six_nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 369;
		
		System.out.println(solution(n));
	}

	public static int solution(int order) {
		int answer = 0;
		int tmp = 0;
		
		while(order >= 1) {
			tmp = order % 10;
			order /= 10;

			if(tmp == 3 || tmp == 6 || tmp == 9) {
				answer++;
			}
		}
		
		return answer;
	}
}
