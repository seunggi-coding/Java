package difficulty_0;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		
		solution(arr);
	}
	public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i < num_list.length; i++) {
        	answer[i] = num_list[num_list.length - i-1];
        	System.out.println(answer[i]);
        }
        
        return answer;
    }

}
