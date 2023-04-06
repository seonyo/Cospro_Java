package D0406;

class Solution2 {
    public int solution(int[] floors) {
        int dist = 0;
        int length = floors.length;
        for(int i = 0; i<length-1; i++){
        	dist+=Math.abs(floors[i]-floors[i+1]);
        }
        return dist;
    }
}
public class Elevator {

	public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] floors = {1, 2, 5, 4, 2};
        int ret = sol.solution(floors);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");

	}

}
