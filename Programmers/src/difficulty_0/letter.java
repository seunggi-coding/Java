package difficulty_0;

public class letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "happy birthday!";
		System.out.println(solution(str));
		
	}
	public static int solution(String message) {
        int answer = 0;
//        length()는 문자열의 길이
        char[] array = new char[message.length()];
        
//        length는 배열의 길이
        for(int i = 0; i < array.length; i++) {
            array[i] = message.charAt(i);
        }
        answer = array.length*2;
        return answer;
    }

}
