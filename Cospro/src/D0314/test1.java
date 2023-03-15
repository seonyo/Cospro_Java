package D0314;

import java.util.Arrays;

class Solution{
	public static int[] Solution(String setSize[]) {
		int answer[] = new int [6];
		for(int i=0; i<setSize.length; i++) {
			if(setSize[i].equals("XS")) answer[0]++;
			else if(setSize[i].equals("S")) answer[1]++;
			else if(setSize[i].equals("M")) answer[2]++;
			else if(setSize[i].equals("L")) answer[3]++;
			else if(setSize[i].equals("XL")) answer[4]++;
			else if(setSize[i].equals("XXL")) answer[5]++;
		}
		return answer;
	}
}
	
public class test1 {
	public static void main(String[] args) {
		Solution sl = new Solution();
		String shirtSize [] = {"XS", "S", "L", "L","XL", "S"};
		int[] ret = sl.Solution(shirtSize);
		System.out.print("Solution: return value of the method is " + Arrays.toString(ret)+ ".");
	
	}
}
