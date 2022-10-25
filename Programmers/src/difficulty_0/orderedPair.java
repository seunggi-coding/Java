package difficulty_0;

public class orderedPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		// 모든 순서쌍의 개수는 n의 약수의 개수와 같다.
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n%i==0) {
				answer++;
			}
		}
		
		return answer;
	}
}
