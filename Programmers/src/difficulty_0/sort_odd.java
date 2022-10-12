package difficulty_0;

public class sort_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		
		System.out.println(solution(n));
	}
	public static int[] solution(int n) {
        int[] answer;
        int idx = 0;
        if(n % 2 == 0) {
        	answer = new int[n/2];
        } else {
        	answer = new int[n/2+1];
        }
        
        for(int i = 1; i <= n; i++) {
        	if(i % 2 == 1) {
        		answer[idx++] = i;
        	}
        }
        
        for(int j = 0; j < answer.length; j++) {
        	System.out.print(answer[j] + " ");
        }
        return answer;
    }
}
