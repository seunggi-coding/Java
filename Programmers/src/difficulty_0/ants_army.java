package difficulty_0;

public class ants_army {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hp = 999;
		System.out.println("최소한의 마리 수는 " + solution(hp) + "마리 입니다.");
	}

	public static int solution(int hp) {
		int answer = 0;
		
		 int[] arr = {5, 3, 1};
     int enemy = hp;
     
     for(int i=0; i<arr.length; i++) {
         if(enemy/arr[i] > 0) {
             System.out.println(arr[i]+"의 공격력 : "+enemy/arr[i]+" 마리 ");
             answer += enemy/arr[i];
             enemy%=arr[i];
         }
     }
     

     System.out.println();
		
		return answer;
	}
}
