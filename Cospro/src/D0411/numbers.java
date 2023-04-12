package D0411;

class Solution1{
	public int solution(int number) {
		int count=0; //소수의 개수를 누적할 변수
		while(number>0) {
			int n = number %10;
			if(n==2 || n==3 || n==5 || n==7) {
				count+=1;
			}
			number/=10;
		}
		return count;
	}
}

public class numbers {
	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int number= 29022531;
		int ret = sol.solution(number);
		
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
