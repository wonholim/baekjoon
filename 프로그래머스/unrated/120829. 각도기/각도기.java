class Solution {
    public int solution(int a) {
        if(0 < a && a < 90){
            return 1;
        }else if(a == 90){
            return 2;
        }else if(a > 90 && a < 180){
            return 3;
        }else{
            return 4;   
        }
    }
}