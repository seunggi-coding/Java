package difficulty_0;

public class Lamb_skewers_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, k = 3;

		System.out.println(solution(n, k));

	}

	public static int solution(int n, int k) {
		int answer = 0;
		if (n / 10 != 0) {
			answer = 12000*n + 2000*k - 2000*(n/10);
		} else {
			answer = 12000 * n + 2000 * k;
		}

		return answer;
	}
}
