package chap04;

public class mathRandom_if {

	public static void main(String[] args) {
		// ������ �ֻ��� ���� ���
		Math.random();	// 0.0 ~ 1.0 ������ �Ǽ� ���
		int number = (int) (Math.random() * 6) + 1;
		System.out.println(number);
		
		if(number==1) {
			System.out.println("1���� ���Խ��ϴ�.");
		} else if(number==2) {
			System.out.println("2���� ���Խ��ϴ�.");
		} else if(number==3) {
			System.out.println("3���� ���Խ��ϴ�.");
		} else if(number==4) {
			System.out.println("4���� ���Խ��ϴ�.");
		} else if(number==5) {
			System.out.println("5���� ���Խ��ϴ�.");
		} else {
			System.out.println("6���� ���Խ��ϴ�.");
		}
	}

}
