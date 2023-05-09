package D0413;

import java.util.Arrays;

class Solution1{
	public int[] solution(int[] scores) {
		int rank[] = new int [scores.length];
		for(int i=0; i<rank.length; i++) rank[i]=1;
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores.length; j++) {
				if(scores[i]<scores[j]) rank[i]++;
			}
		}
		return rank;
	}
}
public class score {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int[] scores = {20,60,98,59};
		
		int[] ret = sol.solution(scores);
		
		System.out.println("점수" + Arrays.toString(scores));
		System.out.println("석차" + Arrays.toString(ret));
	}
}
