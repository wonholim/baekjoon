class Solution {
    public int solution(int hp) {

        return hp % 5 == 0 ? hp / 5 : (hp / 5) + ((hp % 5) / 3) + (((hp % 5) % 3));
    }
}