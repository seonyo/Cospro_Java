package D0323;

 class Solution{
	public int solution(int number) {
		int count = 0;
		for(int i=1; i<= number; i++) {
			int current=i; 
			while(current !=0) {
				if(current %10==3 || current % 10 ==6 || current %10 ==9) { //3 6 9가 들어가는지 확인
					count++; //맞다면 count ++하고
					System.out.println("pair"); //짝 출력
				}
				current=current/10; //자릿수를 바꾸기 ex. 1의 자리 -> 2의 자리
			} //while
		} //for
		System.out.println(); 
		return count;
	}
}
public class ThreeSixNine {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int number = 40;
		int ret = sol.solution(number);
		System.out.println("Solution: return value of the method is  "+ ret +".");
	}

}
