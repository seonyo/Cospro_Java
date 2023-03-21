package D0321;
class Solution{
	public int func_a(int month, int day) {
		int monthList[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		for(int i=1; i<=month; i++) {
			total+= monthList[i+1];
		}
		total += day;
		return total - 1;
	}
	public int solution(int startMonth, int startDay, int endMonth, int endDay) {
		int startTotal = func_a(startMonth, startDay);
		System.out.println(startTotal);
		int endTotal = func_a(endMonth, endDay);
		System.out.println(endTotal);
		return endTotal - startTotal;
	}
}

public class date{
	public static void main(String[] args) {
		Solution sol = new Solution ();
		int startMonth = 1;
		int startDay = 2;
		int endMonth = 2;
		int endDay=2;
		int ret = sol.solution(startMonth, startDay, endMonth, endDay);
		System.out.println("Solution : return value of the method is " + ret + ".");
	}
}
