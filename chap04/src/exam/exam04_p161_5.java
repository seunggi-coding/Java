package exam;

public class exam04_p161_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
				if(i == j) {
					System.out.println();
				}
			}
		}
	}

}