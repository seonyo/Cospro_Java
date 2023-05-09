package D0413;

import java.util.*;

class Solution2 {
	public int solution(int[] StudentScore, int N) {
		int n, temp;
		n = StudentScore[N];
		for (int i = 0; i < StudentScore.length; i++) {
			for (int j = 0; j < StudentScore.length - 1; j++) {
				if (StudentScore[i] > StudentScore[j]) {
					temp = StudentScore[i];
					StudentScore[i] = StudentScore[j];
					StudentScore[j] = temp;
				} // if
			} // for j
		} // for i
		for (int i = 0; i < StudentScore.length; i++)
			if (StudentScore[i] == n)
				n = i + 1;
		
		return n;
	}
}

public class student{
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int StudentScore[] = { 20, 60, 98, 59 };
		int N = 3;
		int ret = sol.solution(StudentScore, N);
		System.out.println(N + "번 학생의 등수는 " + ret + "등입니다.");
	}
}