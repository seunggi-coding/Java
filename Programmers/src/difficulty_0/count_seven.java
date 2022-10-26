package difficulty_0;

public class count_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 77, 17};
		
		System.out.println(solution(arr));
	}

	public static int solution(int[] array) {
		int answer = 0;
		int tmp = 0;
		
		for(int i = 0; i < array.length; i++) {
			while(array[i] >= 1) {
				tmp = array[i] % 10;
				if(tmp == 7) {
					answer++;
				}
				array[i] /= 10;
			}
		}
		
		return answer;
	}
}
