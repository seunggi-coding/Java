package difficulty_0;

public class divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		
		System.out.println(solution(n));
	}
	public static int[] solution(int n) {
		 int[] answer = {};
       answer = new int[n];
        
       int index=0;
       for(int i=1; i<=n; i++){
           if(n%i==0) {
        	   answer[index++]=i;
           }
       }
       int[] answer2 = new int[index];
       for(int i=0; i<index; i++){
           answer2[i] = answer[i];
       }

       return answer2;
   }
}
