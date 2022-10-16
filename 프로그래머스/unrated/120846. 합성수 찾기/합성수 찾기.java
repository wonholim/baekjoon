class Solution {
    public int solution(int n) {
        int a = 0;
        for(int i = 1; i <= n; i++){
            int c = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) c++;
            }
            if(c >= 3) a++;
        }
        return a;
    }
}