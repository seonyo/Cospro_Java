package D0406;

class Solution1 {
    public int solution(int attack, int recovery, int hp) {
        int count = 0;
        while(true){
        	count++;
        	hp -= attack;
            if(hp <= 0) break;
            hp += recovery;
        }
        return count;
    }
}


public class Monster {
	public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int attack = 30;
        int recovery = 10;
        int hp = 60;
        int ret = sol.solution(attack, recovery, hp);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}
