package D0315;

import java.util.Arrays;

class girlIdol{
	public int[] girlIdol (String girl[]) {
		int answer[] = new int [6];
		for(int i=0; i<girl.length; i++) {
			if(girl[i].equals("블랙핑크")) answer[0]++;
			else if(girl[i].equals("레드벨벳")) answer[1]++;
			else if(girl[i].equals("뉴진스")) answer[2]++;
			else if(girl[i].equals("트와이스")) answer[3]++;
			else if(girl[i].equals("엔믹스")) answer[4]++;
			else if(girl[i].equals("르세라핌")) answer[5]++;
		}
		return answer;
	}
}
	
public class IDOL {
	public static void main(String[] args) {
		girlIdol sl = new girlIdol();
		String girl [] = {"블랙핑크", "뉴진스", "뉴진스", "뉴진스","레드벨벳", "엔믹스",  "르세라핌", "엔믹스", "레드벨벳"};
		int[] ret = sl.girlIdol(girl);
		int max = ret[0];
		for(int i = 1; i<ret.length; i++) {
			if(max>ret[i]) {
				max = ret[i];
			}
		}
		for(int i=0; i<ret.length; i++) {
			if(max == ret[i]) System.out.println("인기그룹 : " + girl[max]); break;
		}
		System.out.print("Solution: return value of the method is " + Arrays.toString(ret)+ ".");
	}
}
