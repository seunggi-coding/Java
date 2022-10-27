package difficulty_0;

public class divide_pizza2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i * 6 % n == 0) {
				answer = i;
				break;
			}
		}
		
		return answer;
	}
}
