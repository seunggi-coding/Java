package difficulty_0;

public class taller_than_Meosseuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {149, 180, 192, 170};
		int height = 167;
		
		System.out.println(solution(array, height));
	}
	public static int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
        	if(height < array[i]) {
        		answer++;
        	}
        }
        return answer;
    }
}
