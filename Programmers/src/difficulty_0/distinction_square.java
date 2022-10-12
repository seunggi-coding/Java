package difficulty_0;

public class distinction_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 976;
		
		System.out.println(solution(n));
	}
	public static int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(i * i == n) {
        		answer = 1;
        		break;
        	}
        	answer = 2;
        }
        return answer;
    }
}
