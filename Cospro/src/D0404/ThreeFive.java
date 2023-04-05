package D0404;

class Solution1{
	public int func_a(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 3 ==0) count++;
		}
		
		return count;
	}
	
	public int func_c(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%5==0) count++;
		}
		return count;
	}
	
	public String func_b(int three, int five) {
		if(three==five) return "same";
		else return (three>five) ? "three" : "five";
	}
	
	
	public String solution(int[] arr) {
		int countThree = func_a(arr);
		int countFive = func_c(arr);
		String answer = func_b (countThree, countFive);
		return answer;
	}
	
}
public class ThreeFive {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int[] arr = {2,3,6,9,12,15,10,20,22,25};
		String ret = sol.solution(arr);
		
		
		System.out.println("solution 메소드의 반환 값은 " + ret+ " 입니다.");
		
		
		
	}
}

