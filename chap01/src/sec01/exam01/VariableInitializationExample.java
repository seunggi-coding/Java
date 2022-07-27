package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		
		// value값이 변수 선언하는 과정 혹은 그 직후에 초기화 되지 않고 사용되어 에러 발생
		int result = value + 10;
		
		System.out.println(result);
	}

}
