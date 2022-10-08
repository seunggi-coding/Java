package difficulty_0;

public class division_pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int slice = 7, n = 10;
		
		System.out.println(solution(slice, n));
	}

	public static int solution(int slice, int n) {
		int answer = 0;
		
		if(slice < n) {
			for(int i = 1; i <= n; i++) {
				if(slice * i >= n) {
					answer = i;
					break;
				}
			}
		} else {
			answer = 1;
		}
		
		return answer;
	}
}
