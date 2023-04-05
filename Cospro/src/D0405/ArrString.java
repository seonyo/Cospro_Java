package D0405;

class Solution{
	public String solution (String[] words) {
		String answer = "";
		for(int i=0; i<words.length; i++) answer+=words[i];
		return answer;
	}
}
public class ArrString {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String words1 []= {"my", "favorite", "color", "is", "violet"};
		String ret1 = sol.solution(words1);
		
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
		
		String[] words2 = {"yes", "i", "am"};
		String ret2 = sol.solution(words2);
		
		System.out.println("solution 매소드의 반환 값은 " + ret2 + " 입니다.");
	}

}
