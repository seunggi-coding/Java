package exam;

import java.util.Scanner;

public class exam05_p129_9 {

	public static void main(String[] args) {
		// Ű����� �� �Ǽ��� �Է¹޴´�. (Scanner �̿�)\
		// �Էµ� ù ��° ���� �� ��° ���� ���� ����� "���:��"���� ����ϵ�, 
		// �� ��° ���� 0 �Ǵ� 0.0�� �ԷµǾ��� ��� "���:���Ѵ�"�� ��µǵ��� �ڵ带 �ۼ�. (Scanner�� next() ���)
		Scanner scanner = new Scanner(System.in);
		double first;
		double second;
		
		System.out.print("ù ��° ��: ");
		first = Double.parseDouble(scanner.next());
		
		System.out.print("�� ��° ��: ");
		second = Double.parseDouble(scanner.next());
		System.out.println("---------------");
		System.out.print("���: ");
		if(second != 0.0) {
			System.out.println(first / second);
		} else {
			System.out.println("���Ѵ�");
		}
		
		scanner.close();
	}

}
