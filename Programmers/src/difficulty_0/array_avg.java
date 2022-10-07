package difficulty_0;

public class array_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3};
		
		System.out.println(solution(array));
	}
	public static double solution(int[] numbers) {
        double answer = 0;
        
        for(int i = 0; i <= numbers.length; i++) {
            answer += i;    
        }
        answer /= numbers.length;
        return answer;
    }

}
