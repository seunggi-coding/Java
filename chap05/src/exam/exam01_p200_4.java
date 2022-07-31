package exam;

public class exam01_p200_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		//작성위치
		for(int i=0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max: " + max);
	}

}
