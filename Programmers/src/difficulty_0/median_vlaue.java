package difficulty_0;

import java.util.Arrays;

public class median_vlaue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 7, 10, 11};
		System.out.println(solution(arr));
	}

	public static int solution(int[] array) {
		int answer = 0;
		
//		만들어진 메소드를 사용해 정렬하는 법
//		Arrays.sort(array);
//		for(int i = 0; i < array.length; i++) {
//			if(i+1 == array.length / 2 + 1) {
//				answer = array[i];
//			}
//		}
		
//		만들어진 메소드를 사용하지 않고 정렬하는 방법
		for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
          if (array[j] < array[i]) {
              int temp = array[i];
              array[i] = array[j];
              array[j] = temp;
          }
      }
  }

  answer = array[array.length / 2];
  
  
		return answer;
	}
}
