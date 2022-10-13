class Solution {
    public int solution(int a, int n) {
        return n % a == 0 ? n / a : (n / a) + 1;
    }
}