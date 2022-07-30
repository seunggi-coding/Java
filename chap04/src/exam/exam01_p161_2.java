package exam;

public class exam01_p161_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;	int result=0;
		for(num=1;num<=100;num++) {
			if(num%3 == 0) {
				result += num;
			}
		}
		System.out.println("3의 배수의 합: " + result);
	}

}
