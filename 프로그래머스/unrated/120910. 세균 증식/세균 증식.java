class Solution {
    public int solution(int n, int t) {
        int sum = n;
        for(int i = 0; i < t; i++){
            sum *= 2;
        }
        return sum;
    }
}