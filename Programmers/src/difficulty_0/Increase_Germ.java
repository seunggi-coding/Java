package difficulty_0;

public class Increase_Germ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2, t = 10;
		
		System.out.println(solution(n, t));
	}
	public static int solution(int n, int t) {
        int answer = 0;
        
        for(int i = 0; i < t; i++) {
        	n *= 2;
        }
        answer = n;
        return answer;
    }
}
