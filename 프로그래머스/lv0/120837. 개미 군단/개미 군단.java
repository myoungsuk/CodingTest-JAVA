class Solution {
    public int solution(int hp) {
        int count = 0;

        while(hp > 0) {
            if(hp % 5 == 0) {
                count += hp / 5;
                hp = 0;
            } else if(hp >= 3) {
                hp -= 3;
                count++;
            } else {
                count += hp;
                hp = 0;
            }
        }
        
        return count;
    }
}