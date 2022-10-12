package difficulty_0;

public class overlapped_number_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 2, 3, 4, 5};
		int n = 1;
		
		System.out.println(solution(arr, n));
	}
	public static int solution(int[] array, int n) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) {
                answer++;
            }
        }
        return answer; 
    }
}
