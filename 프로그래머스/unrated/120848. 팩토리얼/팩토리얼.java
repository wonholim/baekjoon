class Solution {
    public int solution(int n) {
        int sum = 1;
        int a = 0;
        for(int i = 1; i <= 10; i++){
            sum *= i;
            if(sum <= n) a = i;
            else break;
        }
        
        return a;
    }
}