package chap04;

public class mathRandom_if {

	public static void main(String[] args) {
		// 임의의 주사위 수를 출력
		Math.random();	// 0.0 ~ 1.0 사이의 실수 출력
		int number = (int) (Math.random() * 6) + 1;
		System.out.println(number);
		
		if(number==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(number==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(number==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(number==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(number==5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
