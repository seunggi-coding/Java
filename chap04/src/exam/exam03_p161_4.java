package exam;

public class exam03_p161_4 {

	public static void main(String[] args) {
		// ��ø for���� �̿��Ͽ� 4x+5y=60�� ��� �ظ� ���� (x, y) ���·� ���
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x + 5*y)==60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

}
