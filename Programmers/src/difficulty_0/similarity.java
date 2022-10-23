package difficulty_0;

public class similarity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = { "a", "b", "c" };
		String[] arr2 = { "com", "b", "d", "p", "c" };

		System.out.println(solution(arr1, arr2));

	}

	public static int solution(String[] s1, String[] s2) {
		int answer = 0;

		if (s1.length < s2.length) {
			for (int i = 0; i < s2.length; i++) {
				for (int j = 0; j < s1.length; j++) {
					if (s2[i].equals(s1[j]))
						answer++;
				}
			}
		} else {
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s2.length; j++) {
					if (s1[i].equals(s2[j]))
						answer++;
				}
			}
		}

		return answer;
	}
}
