package difficulty_0;

public class add_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 930211;
		
		System.out.println(solution(n));
	}
	
//	인수로 받은 정수의 맨 뒷자리부터 더하고 소거하고를 반복하여 더한다
	public static int solution(int n) {
		int answer = 0;
        
        while(n > 0){
            answer += (n % 10);
            n/=10;
        }
        return answer;
    }
}
