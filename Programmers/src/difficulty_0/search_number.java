package difficulty_0;

public class search_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 232443;
		int k = 4;
		
		System.out.println(solution(n, k));
	}

	public static int solution(int num, int k) {
//		정수를 String타입으로 다음 char타입으로 변형하여 비교
		int answer = 0;
		String number = String.valueOf(num);
		char[] arr = number.toCharArray();
		String tmp1 = String.valueOf(k);
		char tmp2 = tmp1.charAt(0);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == tmp2) {
				answer = i+1;
				break;
			} else {
				answer = -1;
			}
		}
		return answer;
	}
}
