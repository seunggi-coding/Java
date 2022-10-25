package difficulty_0;

public class sales_clothes_store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 580000;
		System.out.println(solution(price));
	}

	public static int solution(int price) {
		int answer = 0;
		
		if(price >= 100000 && price < 300000) {
			price *= 0.95;
		} else if(price >= 300000 && price < 500000) {
			price *= 0.9;
		} else if(price >= 500000) {
			price *= 0.8;
		}
		answer = (int)price;
		return answer;
	}
}
