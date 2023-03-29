package D0329;

class Solution{
	public int solution(int scores[]) {
		int cnt=0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] < 800 && scores[i] >= 650)  cnt++;
		}
		return cnt;
	}
}

public class Toic{
	public static void main(String[] args) {
		int scores [] = {650,722,914,558,714,803,650,679,669,800};
		Solution sol = new Solution();
		int ret = sol.solution(scores);
		System.out.println(ret);
	}
}