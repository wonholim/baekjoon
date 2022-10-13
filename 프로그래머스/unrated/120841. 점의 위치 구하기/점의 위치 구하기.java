class Solution {
    public int solution(int[] dot) {
        int a = dot[0];
        int b = dot[1];
        if(a > 0 && b > 0) return 1;
        else if(a < 0 && b > 0) return 2;
        else if(a > 0 && b < 0) return 4;
        else return 3;
    }
}