class Solution {
    public int solution(int n) {
        int a = 6;
        int c = 1;
        while(true){
            if(a % n == 0) break;
            a += 6;
            c++;
        }
        return c;
    }
}