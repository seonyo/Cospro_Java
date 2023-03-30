package D0330;
class Solution{
	public String solution (String characters) {
		String result="";
		result+=characters.charAt(0);
		for(int i=0; i<characters.length()-1; i++) {
			if(characters.charAt(i) != characters.charAt(i+1)) 
				result+=characters.charAt(i+1);
		}
		return result;
	}
}

public class stenceString {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String characters = "senteeenccccceee";
		String ret = sol.solution(characters);
		
		System.out.println("Solution : return value of the method is " + ret + " .");
	}

}
