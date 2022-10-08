package difficulty_0;

public class Dot_Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4};
		System.out.println(solution(arr));
	}
	public static int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0) {
        	answer = 1;
        } else if(dot[0] < 0 && dot[1] > 0) {
        	answer = 2;
        } else if(dot[0] < 0 && dot[1] < 0) {
        	answer = 3;
        } else if(dot[0] > 0 && dot[1] < 0) {
        	answer = 4;
        }
        
        return answer;
    }
}
