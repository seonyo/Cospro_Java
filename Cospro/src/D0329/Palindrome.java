package D0329;
class Solution1{
	boolean solution (String sentence) {
		String str = "";
		for(int i=0; i<sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c != ' ' && c!=',' && c!=',') 
				str +=c;
 		}
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) return false;
		}
		return true;
	
}
public class Palindrome {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		String sentence1 = "never odd or even.";
		boolean ret1 = sol.solution(sentence1);
		
		System.out.println(ret1);
		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		
		System.out.println(ret2);
	}
	}
}
	