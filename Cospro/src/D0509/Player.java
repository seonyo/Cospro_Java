package D0509;

import java.util.Arrays;

class Player {
	public int solution(int[] scores) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		Arrays.sort(scores);
		for(int i=1; i<scores.length-1; i++) {
			answer+=scores[i];
		}
		answer=answer/(scores.length-2);
		return answer;
	}
 
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		Player sol = new Player();
		int[] scores1 = {35, 28, 98, 34, 20, 50, 85, 74, 71, 7};
		int ret1 = sol.solution(scores1);
     
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
     
		int[] scores2 = {1, 1, 1, 1, 1};
		int ret2 = sol.solution(scores2);
     
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}