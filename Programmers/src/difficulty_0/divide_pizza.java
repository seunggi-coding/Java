package difficulty_0;

public class divide_pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 35;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		//문제에서의 피자가게는 피자를 일곱 조각으로 잘라준다.
		int answer = 0;
		if(n > 7) {
			if(n % 7 == 0) {
				answer = n / 7;
			} else {				
				answer = n / 7 + 1;
			}
		} else {
			answer = 1;
		}
		
		return answer;
	}
}
